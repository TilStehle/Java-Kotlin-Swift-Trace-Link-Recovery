package de.unihamburg.masterprojekt2016.traceability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Eve on 20.10.2016.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class TraceabilityLink implements Comparable<TraceabilityLink> {

    private TraceabilityPointer source;
    private TraceabilityPointer target;
    //the probability, that this traceabilitylink is correct
    private Double probability;

    public TraceabilityLink(){
        this.probability=1d;
    }

    public TraceabilityLink(TraceabilityPointer source, TraceabilityPointer target){
        this.probability=1d;
        this.source = source;
        this.target = target;
    }
    public TraceabilityLink(TraceabilityPointer source, TraceabilityPointer target, Double probability){
        this(source,target);
        this.probability=probability;
    }

    public TraceabilityPointer getSource(){
        return source;
    }

    public TraceabilityPointer getTarget(){
        return target;
    }

    public void setSource(TraceabilityPointer source){
        this.source = source;
    }

    public void setTarget(TraceabilityPointer target){
        this.target = target;
    }

    @Override
    public String toString() {
        return "TraceabilityLink [source=" + source + ", target=" + target + ", probability=" + probability + "]";
    }

    public double getProbability()
    {
        return probability;
    }

    public void setProbability(double probability)
    {
        this.probability = probability;
    }



    public boolean hasSameSourceAndTarget(TraceabilityLink other)
    {
        return other.getSource().equals(source)&&other.getTarget().equals(target);
    }


    /**
     * Returns a TraceabilityLink with reversed source/target
     *
     * @return TraceabilityLink(target, source)
     */
    public TraceabilityLink getReversedLink(){
        return new TraceabilityLink(target, source);
    }

    @Override
    public int compareTo(TraceabilityLink other)
    {
        return this.probability.compareTo(other.probability);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((probability == null) ? 0 : probability.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((target == null) ? 0 : target.hashCode());
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
        TraceabilityLink other = (TraceabilityLink) obj;
        if (probability == null) {
            if (other.probability != null)
                return false;
        } else if (!probability.equals(other.probability))
            return false;
        if (source == null) {
            if (other.source != null)
                return false;
        } else if (!source.equals(other.source))
            return false;
        if (target == null) {
            if (other.target != null)
                return false;
        } else if (!target.equals(other.target))
            return false;
        return true;
    }


}
