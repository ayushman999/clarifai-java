// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/image.proto

package clarifai2.internal.grpc.api;

public final class ImageOuterClass {
  private ImageOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ImageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:clarifai.api.Image)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string url = 1;</code>
     */
    java.lang.String getUrl();
    /**
     * <code>string url = 1;</code>
     */
    com.google.protobuf.ByteString
        getUrlBytes();

    /**
     * <code>bytes base64 = 2;</code>
     */
    com.google.protobuf.ByteString getBase64();

    /**
     * <code>repeated float crop = 3;</code>
     */
    java.util.List<java.lang.Float> getCropList();
    /**
     * <code>repeated float crop = 3;</code>
     */
    int getCropCount();
    /**
     * <code>repeated float crop = 3;</code>
     */
    float getCrop(int index);

    /**
     * <code>bool allow_duplicate_url = 4;</code>
     */
    boolean getAllowDuplicateUrl();
  }
  /**
   * Protobuf type {@code clarifai.api.Image}
   */
  public  static final class Image extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:clarifai.api.Image)
      ImageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Image.newBuilder() to construct.
    private Image(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Image() {
      url_ = "";
      base64_ = com.google.protobuf.ByteString.EMPTY;
      crop_ = java.util.Collections.emptyList();
      allowDuplicateUrl_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Image(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              url_ = s;
              break;
            }
            case 18: {

              base64_ = input.readBytes();
              break;
            }
            case 29: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                crop_ = new java.util.ArrayList<java.lang.Float>();
                mutable_bitField0_ |= 0x00000004;
              }
              crop_.add(input.readFloat());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
                crop_ = new java.util.ArrayList<java.lang.Float>();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                crop_.add(input.readFloat());
              }
              input.popLimit(limit);
              break;
            }
            case 32: {

              allowDuplicateUrl_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          crop_ = java.util.Collections.unmodifiableList(crop_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return clarifai2.internal.grpc.api.ImageOuterClass.internal_static_clarifai_api_Image_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return clarifai2.internal.grpc.api.ImageOuterClass.internal_static_clarifai_api_Image_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              clarifai2.internal.grpc.api.ImageOuterClass.Image.class, clarifai2.internal.grpc.api.ImageOuterClass.Image.Builder.class);
    }

    private int bitField0_;
    public static final int URL_FIELD_NUMBER = 1;
    private volatile java.lang.Object url_;
    /**
     * <code>string url = 1;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      }
    }
    /**
     * <code>string url = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BASE64_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString base64_;
    /**
     * <code>bytes base64 = 2;</code>
     */
    public com.google.protobuf.ByteString getBase64() {
      return base64_;
    }

    public static final int CROP_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Float> crop_;
    /**
     * <code>repeated float crop = 3;</code>
     */
    public java.util.List<java.lang.Float>
        getCropList() {
      return crop_;
    }
    /**
     * <code>repeated float crop = 3;</code>
     */
    public int getCropCount() {
      return crop_.size();
    }
    /**
     * <code>repeated float crop = 3;</code>
     */
    public float getCrop(int index) {
      return crop_.get(index);
    }
    private int cropMemoizedSerializedSize = -1;

    public static final int ALLOW_DUPLICATE_URL_FIELD_NUMBER = 4;
    private boolean allowDuplicateUrl_;
    /**
     * <code>bool allow_duplicate_url = 4;</code>
     */
    public boolean getAllowDuplicateUrl() {
      return allowDuplicateUrl_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (!getUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
      }
      if (!base64_.isEmpty()) {
        output.writeBytes(2, base64_);
      }
      if (getCropList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(cropMemoizedSerializedSize);
      }
      for (int i = 0; i < crop_.size(); i++) {
        output.writeFloatNoTag(crop_.get(i));
      }
      if (allowDuplicateUrl_ != false) {
        output.writeBool(4, allowDuplicateUrl_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
      }
      if (!base64_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, base64_);
      }
      {
        int dataSize = 0;
        dataSize = 4 * getCropList().size();
        size += dataSize;
        if (!getCropList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cropMemoizedSerializedSize = dataSize;
      }
      if (allowDuplicateUrl_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, allowDuplicateUrl_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof clarifai2.internal.grpc.api.ImageOuterClass.Image)) {
        return super.equals(obj);
      }
      clarifai2.internal.grpc.api.ImageOuterClass.Image other = (clarifai2.internal.grpc.api.ImageOuterClass.Image) obj;

      boolean result = true;
      result = result && getUrl()
          .equals(other.getUrl());
      result = result && getBase64()
          .equals(other.getBase64());
      result = result && getCropList()
          .equals(other.getCropList());
      result = result && (getAllowDuplicateUrl()
          == other.getAllowDuplicateUrl());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
      hash = (37 * hash) + BASE64_FIELD_NUMBER;
      hash = (53 * hash) + getBase64().hashCode();
      if (getCropCount() > 0) {
        hash = (37 * hash) + CROP_FIELD_NUMBER;
        hash = (53 * hash) + getCropList().hashCode();
      }
      hash = (37 * hash) + ALLOW_DUPLICATE_URL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getAllowDuplicateUrl());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static clarifai2.internal.grpc.api.ImageOuterClass.Image parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(clarifai2.internal.grpc.api.ImageOuterClass.Image prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code clarifai.api.Image}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:clarifai.api.Image)
        clarifai2.internal.grpc.api.ImageOuterClass.ImageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return clarifai2.internal.grpc.api.ImageOuterClass.internal_static_clarifai_api_Image_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return clarifai2.internal.grpc.api.ImageOuterClass.internal_static_clarifai_api_Image_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                clarifai2.internal.grpc.api.ImageOuterClass.Image.class, clarifai2.internal.grpc.api.ImageOuterClass.Image.Builder.class);
      }

      // Construct using clarifai2.internal.grpc.api.ImageOuterClass.Image.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        url_ = "";

        base64_ = com.google.protobuf.ByteString.EMPTY;

        crop_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        allowDuplicateUrl_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return clarifai2.internal.grpc.api.ImageOuterClass.internal_static_clarifai_api_Image_descriptor;
      }

      public clarifai2.internal.grpc.api.ImageOuterClass.Image getDefaultInstanceForType() {
        return clarifai2.internal.grpc.api.ImageOuterClass.Image.getDefaultInstance();
      }

      public clarifai2.internal.grpc.api.ImageOuterClass.Image build() {
        clarifai2.internal.grpc.api.ImageOuterClass.Image result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public clarifai2.internal.grpc.api.ImageOuterClass.Image buildPartial() {
        clarifai2.internal.grpc.api.ImageOuterClass.Image result = new clarifai2.internal.grpc.api.ImageOuterClass.Image(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.url_ = url_;
        result.base64_ = base64_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          crop_ = java.util.Collections.unmodifiableList(crop_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.crop_ = crop_;
        result.allowDuplicateUrl_ = allowDuplicateUrl_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof clarifai2.internal.grpc.api.ImageOuterClass.Image) {
          return mergeFrom((clarifai2.internal.grpc.api.ImageOuterClass.Image)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(clarifai2.internal.grpc.api.ImageOuterClass.Image other) {
        if (other == clarifai2.internal.grpc.api.ImageOuterClass.Image.getDefaultInstance()) return this;
        if (!other.getUrl().isEmpty()) {
          url_ = other.url_;
          onChanged();
        }
        if (other.getBase64() != com.google.protobuf.ByteString.EMPTY) {
          setBase64(other.getBase64());
        }
        if (!other.crop_.isEmpty()) {
          if (crop_.isEmpty()) {
            crop_ = other.crop_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureCropIsMutable();
            crop_.addAll(other.crop_);
          }
          onChanged();
        }
        if (other.getAllowDuplicateUrl() != false) {
          setAllowDuplicateUrl(other.getAllowDuplicateUrl());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        clarifai2.internal.grpc.api.ImageOuterClass.Image parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (clarifai2.internal.grpc.api.ImageOuterClass.Image) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object url_ = "";
      /**
       * <code>string url = 1;</code>
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          url_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string url = 1;</code>
       */
      public com.google.protobuf.ByteString
          getUrlBytes() {
        java.lang.Object ref = url_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          url_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string url = 1;</code>
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string url = 1;</code>
       */
      public Builder clearUrl() {
        
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <code>string url = 1;</code>
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        url_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString base64_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes base64 = 2;</code>
       */
      public com.google.protobuf.ByteString getBase64() {
        return base64_;
      }
      /**
       * <code>bytes base64 = 2;</code>
       */
      public Builder setBase64(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        base64_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes base64 = 2;</code>
       */
      public Builder clearBase64() {
        
        base64_ = getDefaultInstance().getBase64();
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Float> crop_ = java.util.Collections.emptyList();
      private void ensureCropIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          crop_ = new java.util.ArrayList<java.lang.Float>(crop_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated float crop = 3;</code>
       */
      public java.util.List<java.lang.Float>
          getCropList() {
        return java.util.Collections.unmodifiableList(crop_);
      }
      /**
       * <code>repeated float crop = 3;</code>
       */
      public int getCropCount() {
        return crop_.size();
      }
      /**
       * <code>repeated float crop = 3;</code>
       */
      public float getCrop(int index) {
        return crop_.get(index);
      }
      /**
       * <code>repeated float crop = 3;</code>
       */
      public Builder setCrop(
          int index, float value) {
        ensureCropIsMutable();
        crop_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float crop = 3;</code>
       */
      public Builder addCrop(float value) {
        ensureCropIsMutable();
        crop_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float crop = 3;</code>
       */
      public Builder addAllCrop(
          java.lang.Iterable<? extends java.lang.Float> values) {
        ensureCropIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, crop_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated float crop = 3;</code>
       */
      public Builder clearCrop() {
        crop_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      private boolean allowDuplicateUrl_ ;
      /**
       * <code>bool allow_duplicate_url = 4;</code>
       */
      public boolean getAllowDuplicateUrl() {
        return allowDuplicateUrl_;
      }
      /**
       * <code>bool allow_duplicate_url = 4;</code>
       */
      public Builder setAllowDuplicateUrl(boolean value) {
        
        allowDuplicateUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool allow_duplicate_url = 4;</code>
       */
      public Builder clearAllowDuplicateUrl() {
        
        allowDuplicateUrl_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:clarifai.api.Image)
    }

    // @@protoc_insertion_point(class_scope:clarifai.api.Image)
    private static final clarifai2.internal.grpc.api.ImageOuterClass.Image DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new clarifai2.internal.grpc.api.ImageOuterClass.Image();
    }

    public static clarifai2.internal.grpc.api.ImageOuterClass.Image getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Image>
        PARSER = new com.google.protobuf.AbstractParser<Image>() {
      public Image parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Image(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Image> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Image> getParserForType() {
      return PARSER;
    }

    public clarifai2.internal.grpc.api.ImageOuterClass.Image getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_clarifai_api_Image_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_clarifai_api_Image_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036proto/clarifai/api/image.proto\022\014clarif" +
      "ai.api\"O\n\005Image\022\013\n\003url\030\001 \001(\t\022\016\n\006base64\030\002" +
      " \001(\014\022\014\n\004crop\030\003 \003(\002\022\033\n\023allow_duplicate_ur" +
      "l\030\004 \001(\010BA\n\033clarifai2.internal.grpc.apiZ\003" +
      "api\242\002\004CAIP\302\002\001_\312\002\021Clarifai\\Internalb\006prot" +
      "o3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_clarifai_api_Image_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_clarifai_api_Image_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_clarifai_api_Image_descriptor,
        new java.lang.String[] { "Url", "Base64", "Crop", "AllowDuplicateUrl", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
