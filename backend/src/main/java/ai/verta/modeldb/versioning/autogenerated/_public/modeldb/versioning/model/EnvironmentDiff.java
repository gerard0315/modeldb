// THIS FILE IS AUTO-GENERATED. DO NOT EDIT
package ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.*;
import ai.verta.modeldb.versioning.blob.visitors.Visitor;

public class EnvironmentDiff {
    public PythonEnvironmentDiff Python;
    public DockerEnvironmentDiff Docker;
    public List<EnvironmentVariablesBlob> EnvironmentVariablesA;
    public List<EnvironmentVariablesBlob> EnvironmentVariablesB;
    public List<String> CommandLineA;
    public List<String> CommandLineB;

    public EnvironmentDiff() {
        this.Python = null;
        this.Docker = null;
        this.EnvironmentVariablesA = null;
        this.EnvironmentVariablesB = null;
        this.CommandLineA = null;
        this.CommandLineB = null;
    }

    public EnvironmentDiff setPython(PythonEnvironmentDiff value) {
        this.Python = value;
        return this;
    }
    public EnvironmentDiff setDocker(DockerEnvironmentDiff value) {
        this.Docker = value;
        return this;
    }
    public EnvironmentDiff setEnvironmentVariablesA(List<EnvironmentVariablesBlob> value) {
        this.EnvironmentVariablesA = value;
        return this;
    }
    public EnvironmentDiff setEnvironmentVariablesB(List<EnvironmentVariablesBlob> value) {
        this.EnvironmentVariablesB = value;
        return this;
    }
    public EnvironmentDiff setCommandLineA(List<String> value) {
        this.CommandLineA = value;
        return this;
    }
    public EnvironmentDiff setCommandLineB(List<String> value) {
        this.CommandLineB = value;
        return this;
    }

    static public EnvironmentDiff fromProto(ai.verta.modeldb.versioning.EnvironmentDiff blob) {
        EnvironmentDiff obj = new EnvironmentDiff();
        {
            Function<Void,PythonEnvironmentDiff> f = x -> PythonEnvironmentDiff.fromProto(blob.getPython());
            if (f != null) {
                obj.Python = f.apply(null);
            }
        }
        {
            Function<Void,DockerEnvironmentDiff> f = x -> DockerEnvironmentDiff.fromProto(blob.getDocker());
            if (f != null) {
                obj.Docker = f.apply(null);
            }
        }
        {
            Function<List<EnvironmentVariablesBlob>,List<EnvironmentVariablesBlob>> f = null;
            if (f != null) {
                obj.EnvironmentVariablesA = f.apply(null);
            }
        }
        {
            Function<List<EnvironmentVariablesBlob>,List<EnvironmentVariablesBlob>> f = null;
            if (f != null) {
                obj.EnvironmentVariablesB = f.apply(null);
            }
        }
        {
            Function<List<String>,List<String>> f = null;
            if (f != null) {
                obj.CommandLineA = f.apply(null);
            }
        }
        {
            Function<List<String>,List<String>> f = null;
            if (f != null) {
                obj.CommandLineB = f.apply(null);
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
            Function<PythonEnvironmentDiff,Void> f = v -> {v.preVisitDeep(visitor); return null;};
            if (f != null) {
                f.apply(this.Python);
            }
        }
        {
            Function<DockerEnvironmentDiff,Void> f = v -> {v.preVisitDeep(visitor); return null;};
            if (f != null) {
                f.apply(this.Docker);
            }
        }
        {
            Function<List<EnvironmentVariablesBlob>,Void> f = v -> {v.stream().forEach(s -> s.preVisitDeep(visitor)); return null;};
            if (f != null) {
                f.apply(this.EnvironmentVariablesA);
            }
        }
        {
            Function<List<EnvironmentVariablesBlob>,Void> f = v -> {v.stream().forEach(s -> s.preVisitDeep(visitor)); return null;};
            if (f != null) {
                f.apply(this.EnvironmentVariablesB);
            }
        }
        {
            Function<List<String>,Void> f = v -> {v.stream().forEach(s -> s.preVisitDeep(visitor)); return null;};
            if (f != null) {
                f.apply(this.CommandLineA);
            }
        }
        {
            Function<List<String>,Void> f = v -> {v.stream().forEach(s -> s.preVisitDeep(visitor)); return null;};
            if (f != null) {
                f.apply(this.CommandLineB);
            }
        }
    }

    public EnvironmentDiff postVisitShallow(Visitor visitor) throws ModelDBException {
        return visitor.postVisit(this);
    }

    public EnvironmentDiff postVisitDeep(Visitor visitor) throws ModelDBException {
        {
            Function<PythonEnvironmentDiff,PythonEnvironmentDiff> f = v -> v.postVisitDeep(visitor);
            if (f != null) {
                this.Python = f.apply(this.Python);
            }
        }
        {
            Function<DockerEnvironmentDiff,DockerEnvironmentDiff> f = v -> v.postVisitDeep(visitor);
            if (f != null) {
                this.Docker = f.apply(this.Docker);
            }
        }
        {
            Function<List<EnvironmentVariablesBlob>,List<EnvironmentVariablesBlob>> f = v -> v.stream().map(s -> s.postVisitDeep(visitor)).collect(Collectors.toList());
            if (f != null) {
                this.EnvironmentVariablesA = f.apply(this.EnvironmentVariablesA);
            }
        }
        {
            Function<List<EnvironmentVariablesBlob>,List<EnvironmentVariablesBlob>> f = v -> v.stream().map(s -> s.postVisitDeep(visitor)).collect(Collectors.toList());
            if (f != null) {
                this.EnvironmentVariablesB = f.apply(this.EnvironmentVariablesB);
            }
        }
        {
            Function<List<String>,List<String>> f = v -> v.stream().map(s -> s.postVisitDeep(visitor)).collect(Collectors.toList());
            if (f != null) {
                this.CommandLineA = f.apply(this.CommandLineA);
            }
        }
        {
            Function<List<String>,List<String>> f = v -> v.stream().map(s -> s.postVisitDeep(visitor)).collect(Collectors.toList());
            if (f != null) {
                this.CommandLineB = f.apply(this.CommandLineB);
            }
        }
        return this.postVisitShallow(visitor);
    }
}
