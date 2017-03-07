package de.unihamburg.masterprojekt2016.traceability;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlElementWrapper;

/**
 * @author Jakob Andersen
 */

public class TraceabilityLinkSetWrapper {

	@XmlElementWrapper
    private Set<TraceabilityLink> set;

    public TraceabilityLinkSetWrapper() { 
    	this.set = new HashSet<>();
    }
    
    public boolean add(TraceabilityLink s) {
    	return set.add(s);
    }
    
    public Set<TraceabilityLink> get() {
        return this.set;
    }
    
    public void set(Set<TraceabilityLink> set) {
        this.set = set;
    }

	@Override
	public String toString() {
		return "TraceabilityPointerListWrapper [set=" + set + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((set == null) ? 0 : set.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TraceabilityLinkSetWrapper other = (TraceabilityLinkSetWrapper) obj;
		if (set == null) {
			if (other.set != null)
				return false;
		} else if (!set.equals(other.set))
			return false;
		return true;
	}

    
    
}