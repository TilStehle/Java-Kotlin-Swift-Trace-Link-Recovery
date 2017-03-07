package de.unihamburg.masterprojekt2016.traceability;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class TraceabilityModel {

	private Map<TraceabilityPointer, TraceabilityLinkSetWrapper> traceabilityLinksBySourcePointers;
	
	private Map<TraceabilityPointer, TraceabilityModel> subModels;
	private TraceabilityPointer describedArtefactPointer;

	public TraceabilityModel() {
		this.traceabilityLinksBySourcePointers = new HashMap<>();
		this.subModels = new HashMap<>();
	}

	public TraceabilityModel(TraceabilityPointer describedArtefactPointer) {
		this();
		this.describedArtefactPointer = describedArtefactPointer;
	}

	public TraceabilityLink[] getTraceabilityLinkList() {	
		List<TraceabilityLink> traceList = new ArrayList<>();
		for (TraceabilityLinkSetWrapper setWrapper : traceabilityLinksBySourcePointers.values()) {
				traceList.addAll(setWrapper.get());
		}
		return traceList.toArray(new TraceabilityLink[traceList.size()]);
	}
	
	@Deprecated
	@XmlElementWrapper(name = "traceabilityLinks")
	void setTraceabilityLinkList(TraceabilityLink[] traceabilityLinks) {	
		for (TraceabilityLink traceabilityLink : traceabilityLinks) {
			TraceabilityPointer source = traceabilityLink.getSource();
			TraceabilityLinkSetWrapper traceabilityLinkSetWrapper = traceabilityLinksBySourcePointers.get(source);
			if(traceabilityLinkSetWrapper == null) {
				traceabilityLinkSetWrapper =new TraceabilityLinkSetWrapper(); 
				traceabilityLinksBySourcePointers.put(source, traceabilityLinkSetWrapper);
			}
			traceabilityLinkSetWrapper.add(traceabilityLink);
		}
	}
	
	
	/**
	 * @deprecated use {@link #getSubModels()} instead. This Method is only for
	 *             XML Import
	 */
	@Deprecated
	@XmlElementWrapper(name = "subModels")
	TraceabilityModel[] getSubModelArray() {
		return subModels.values().toArray(new TraceabilityModel[subModels.size()]);
	}

	/**
	 * @deprecated use {@link #addSubmodel(TraceabilityModel subModel)} instead.
	 *             This Method is only for XML Import
	 */
	@Deprecated
	void setSubModelArray(TraceabilityModel[] subModelList) {
		for (TraceabilityModel traceabilityModel : subModelList) {
			this.subModels.put(traceabilityModel.getDescribedArtefactPointer(), traceabilityModel);
		}

	}

	public void addTraceabilityLink(TraceabilityLink traceabilityLink) {
		if(traceabilityLinksBySourcePointers.containsKey(traceabilityLink.getSource())) {
			TraceabilityLinkSetWrapper set = traceabilityLinksBySourcePointers.get(traceabilityLink.getSource());
			set.add(traceabilityLink);
		} else {
			TraceabilityLinkSetWrapper set = new TraceabilityLinkSetWrapper();
			set.add(traceabilityLink);
			traceabilityLinksBySourcePointers.put(traceabilityLink.getSource(), set);
		}
	}
	
	public Set<TraceabilityLink> getTraceabilityLinkForPointer(TraceabilityPointer pointer) {
		Set<TraceabilityLink> traceabilityLinkForPointer = null;
		TraceabilityLinkSetWrapper linkSet = this.traceabilityLinksBySourcePointers.get(pointer);
		if (linkSet == null) {
			for (TraceabilityModel subModel : this.subModels.values()) {
				traceabilityLinkForPointer = subModel.getTraceabilityLinkForPointer(pointer);
				if (traceabilityLinkForPointer != null) {
					break;
				}
			}
		} else {
			return linkSet.get();
		}
		return traceabilityLinkForPointer;
	}

	public void setTraceabilityLinksBySourcePointers(
			Map<TraceabilityPointer, TraceabilityLinkSetWrapper> traceabilityLinksBySourcePointers) {
		this.traceabilityLinksBySourcePointers = traceabilityLinksBySourcePointers;
	}

	@XmlTransient
	public Map<TraceabilityPointer, TraceabilityLinkSetWrapper> getTraceabilityLinksBySourcePointers() {
		return traceabilityLinksBySourcePointers;
	}

	public void addSubModel(TraceabilityModel subModel) {
		subModels.put(subModel.getDescribedArtefactPointer(), subModel);
	}

	public void removeSubModel(TraceabilityPointer pointer) {
		subModels.remove(pointer);
	}

	public void setDescribedArtefactPointer(TraceabilityPointer describedArtefactPointer) {
		this.describedArtefactPointer = describedArtefactPointer;
	}

	@Transient
	public Map<TraceabilityPointer, TraceabilityModel> getSubModels() {
		return subModels;
	}

	public TraceabilityPointer getDescribedArtefactPointer() {
		return describedArtefactPointer;
	}

	public String description() {
		String description = "Toplevel Model";
		if (this.describedArtefactPointer != null) {
			description = "TraceabilityModel for: " + describedArtefactPointer.toString();
		}
		for (TraceabilityPointer traceabilityPointer : subModels.keySet()) {
			description = description + "\n submodel:" + traceabilityPointer.toString();
		}
		return description;
	}

	@Override
	public String toString() {
		return "TraceabilityModel [traceabilityLinksBySourcePointers=" + traceabilityLinksBySourcePointers
				+ ", subModels=" + subModels + ", describedArtefactPointer=" + describedArtefactPointer + "]";
	}

	public void addAllTraceabilityLinks(TraceabilityLinkSetWrapper tlinkSet) {
		addAllTraceabilityLinks(tlinkSet.get());
		
	}

	public void addAllTraceabilityLinks(Set<TraceabilityLink> tlinkSet) {
		for (TraceabilityLink traceabilityLink : tlinkSet) {
			addTraceabilityLink(traceabilityLink);
		}
	}
	
}
