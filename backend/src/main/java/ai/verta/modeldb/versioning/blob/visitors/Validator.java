package ai.verta.modeldb.versioning.blob.visitors;

import ai.verta.modeldb.ModelDBException;
import ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model.PathDatasetBlob;
import ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model.PathDatasetBlobModel;
import ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model.S3DatasetBlob;
import ai.verta.modeldb.versioning.autogenerated._public.modeldb.versioning.model.S3DatasetBlobModel;
import io.grpc.Status;

public class Validator extends Visitor {
  @Override
  public void preVisit(S3DatasetBlob blob) throws ModelDBException {
    if (blob.Components.isEmpty())
      throw new ModelDBException("Blob should not be empty", Status.Code.INVALID_ARGUMENT);
  }

  @Override
  public void preVisit(PathDatasetBlob blob) throws ModelDBException {
    if (blob.Components.isEmpty())
      throw new ModelDBException("Blob should not be empty", Status.Code.INVALID_ARGUMENT);
  }
}
