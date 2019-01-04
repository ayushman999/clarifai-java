package clarifai2.dto.model.output_info;

import clarifai2.internal.grpc.api.ConceptOuterClass;
import clarifai2.internal.grpc.api.ModelOuterClass;
import clarifai2.dto.prediction.Concept;
import clarifai2.exception.ClarifaiException;
import com.google.auto.value.AutoValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("NullableProblems")
@AutoValue
public abstract class LogoOutputInfo extends OutputInfo {

  LogoOutputInfo() {} // AutoValue instances only

  @NotNull public abstract String type();

  @NotNull public abstract String typeExt();

  @Nullable public abstract List<Concept> concepts();

  @Override @NotNull public ModelOuterClass.OutputInfo serialize() {
    throw new ClarifaiException(this.getClass().getSimpleName() + " is not serializable");
  }

  @NotNull public static LogoOutputInfo deserializeInner(ModelOuterClass.OutputInfo outputInfo) {
    List<Concept> concepts = new ArrayList<>();
    for (ConceptOuterClass.Concept concept : outputInfo.getData().getConceptsList()) {
      concepts.add(Concept.deserialize(concept));
    }
    return new AutoValue_LogoOutputInfo(outputInfo.getType(), outputInfo.getTypeExt(), concepts);
  }
}
