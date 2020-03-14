// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;

public class HyperparameterSetConfigBlob {
    public String Name;
    public ContinuousHyperparameterSetConfigBlob Continuous;
    public DiscreteHyperparameterSetConfigBlob Discrete;

    public HyperparameterSetConfigBlob() {
        this.Name = null;
        this.Continuous = null;
        this.Discrete = null;
    }

    public HyperparameterSetConfigBlob setName(String value) {
        this.Name = value;
        return this;
    }
    public HyperparameterSetConfigBlob setContinuous(ContinuousHyperparameterSetConfigBlob value) {
        this.Continuous = value;
        return this;
    }
    public HyperparameterSetConfigBlob setDiscrete(DiscreteHyperparameterSetConfigBlob value) {
        this.Discrete = value;
        return this;
    }

    static public HyperparameterSetConfigBlob fromProto(ai.verta.modeldb.versioning.HyperparameterSetConfigBlob blob) {
        HyperparameterSetConfigBlob obj = new HyperparameterSetConfigBlob();
        {
            Function<String,String> f = null;
            if (f != null) {
                obj.Name = f.apply(null);
            }
        }
        {
            Function<Void,ContinuousHyperparameterSetConfigBlob> f = x -> ContinuousHyperparameterSetConfigBlob.fromProto(blob.getContinuous());
            if (f != null) {
                obj.Continuous = f.apply(null);
            }
        }
        {
            Function<Void,DiscreteHyperparameterSetConfigBlob> f = x -> DiscreteHyperparameterSetConfigBlob.fromProto(blob.getDiscrete());
            if (f != null) {
                obj.Discrete = f.apply(null);
            }
        }
        return obj;
    }

    public void preVisitShallow(Visitor visitor) throws ModelDBException {
        visitor.preVisit(this);
    }

    public void preVisitDeep(Visitor visitor) throws ModelDBException {
        this.preVisitShallow(visitor);
        {
            Function<String,Void> f = null;
            if (f != null) {
                f.apply(this.Name);
            }
        }
        {
            Function<ContinuousHyperparameterSetConfigBlob,Void> f = v -> {v.preVisitDeep(visitor); return null;};
            if (f != null) {
                f.apply(this.Continuous);
            }
        }
        {
            Function<DiscreteHyperparameterSetConfigBlob,Void> f = v -> {v.preVisitDeep(visitor); return null;};
            if (f != null) {
                f.apply(this.Discrete);
            }
        }
    }

    public HyperparameterSetConfigBlob postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisit(this);
    }

    public HyperparameterSetConfigBlob postVisitDeep(Visitor visitor) throws ModelDBException {
        {
            Function<String,String> f = null;
            if (f != null) {
                this.Name = f.apply(this.Name);
            }
        }
        {
            Function<ContinuousHyperparameterSetConfigBlob,ContinuousHyperparameterSetConfigBlob> f = v -> v.postVisitDeep(visitor);
            if (f != null) {
                this.Continuous = f.apply(this.Continuous);
            }
        }
        {
            Function<DiscreteHyperparameterSetConfigBlob,DiscreteHyperparameterSetConfigBlob> f = v -> v.postVisitDeep(visitor);
            if (f != null) {
                this.Discrete = f.apply(this.Discrete);
            }
        }
        return this.postVisitShallow(visitor);
    }
}