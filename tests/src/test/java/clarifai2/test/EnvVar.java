package clarifai2.test;

enum EnvVar {
  CLARIFAI_APP_ID,  // Deprecated.
  CLARIFAI_APP_SECRET,  // Deprecated.

  CLARIFAI_API_KEY,   // all scopes
  CLARIFAI_API_BASE,

  CLARIFAI_API_KEY_NO_SCOPES,
  CLARIFAI_API_KEY_ALL_GET,
  CLARIFAI_API_KEY_INPUTS_GET_PATCH,
  CLARIFAI_API_KEY_INPUTS_GET_PATCH_AND_CONCEPTS_GET,
  CLARIFAI_API_KEY_MODELS_GET,
  CLARIFAI_API_KEY_MODELS_AND_CONCEPTS_GET,
  CLARIFAI_API_KEY_MODELS_AND_INPUTS_GET,
  CLARIFAI_API_KEY_PREDICT_AND_INPUTS_GET,
  CLARIFAI_API_KEY_PREDICT_AND_INPUTS_MODELS_CONCEPTS_GET;

  private final String envVarName;

  EnvVar() {
    this.envVarName = name();
  }

  public String value() {
    return System.getenv(envVarName);
  }
}
