// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;

public class PathDatasetBlob {
    public List<PathDatasetComponentBlob> Components;

    public PathDatasetBlob() {
        this.Components = null;
    }

    public PathDatasetBlob setComponents(List<PathDatasetComponentBlob> value) {
        this.Components = value;
        return this;
    }

    static public PathDatasetBlob fromProto(ai.verta.modeldb.versioning.PathDatasetBlob blob) {
        PathDatasetBlob obj = new PathDatasetBlob();
        {
            Function<List<PathDatasetComponentBlob>,List<PathDatasetComponentBlob>> f = null;
            if (f != null) {
                obj.Components = f.apply(null);
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
            Function<List<PathDatasetComponentBlob>,Void> f = v -> {v.stream().forEach(s -> s.preVisitDeep(visitor)); return null;};
            if (f != null) {
                f.apply(this.Components);
            }
        }
    }

    public PathDatasetBlob postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisit(this);
    }

    public PathDatasetBlob postVisitDeep(Visitor visitor) throws ModelDBException {
        {
            Function<List<PathDatasetComponentBlob>,List<PathDatasetComponentBlob>> f = v -> v.stream().map(s -> s.postVisitDeep(visitor)).collect(Collectors.toList());
            if (f != null) {
                this.Components = f.apply(this.Components);
            }
        }
        return this.postVisitShallow(visitor);
    }
}
