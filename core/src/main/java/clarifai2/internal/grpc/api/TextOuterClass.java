// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/text.proto

package clarifai2.internal.grpc.api;

public final class TextOuterClass {
  private TextOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TextOrBuilder extends
      // @@protoc_insertion_point(interface_extends:clarifai.api.Text)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string raw = 1;</code>
     */
    java.lang.String getRaw();
    /**
     * <code>string raw = 1;</code>
     */
    com.google.protobuf.ByteString
        getRawBytes();
  }
  /**
   * Protobuf type {@code clarifai.api.Text}
   */
  public  static final class Text extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:clarifai.api.Text)
      TextOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Text.newBuilder() to construct.
    private Text(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Text() {
      raw_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Text(
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

              raw_ = s;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return clarifai2.internal.grpc.api.TextOuterClass.internal_static_clarifai_api_Text_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return clarifai2.internal.grpc.api.TextOuterClass.internal_static_clarifai_api_Text_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              clarifai2.internal.grpc.api.TextOuterClass.Text.class, clarifai2.internal.grpc.api.TextOuterClass.Text.Builder.class);
    }

    public static final int RAW_FIELD_NUMBER = 1;
    private volatile java.lang.Object raw_;
    /**
     * <code>string raw = 1;</code>
     */
    public java.lang.String getRaw() {
      java.lang.Object ref = raw_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        raw_ = s;
        return s;
      }
    }
    /**
     * <code>string raw = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRawBytes() {
      java.lang.Object ref = raw_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        raw_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getRawBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, raw_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getRawBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, raw_);
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
      if (!(obj instanceof clarifai2.internal.grpc.api.TextOuterClass.Text)) {
        return super.equals(obj);
      }
      clarifai2.internal.grpc.api.TextOuterClass.Text other = (clarifai2.internal.grpc.api.TextOuterClass.Text) obj;

      boolean result = true;
      result = result && getRaw()
          .equals(other.getRaw());
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
      hash = (37 * hash) + RAW_FIELD_NUMBER;
      hash = (53 * hash) + getRaw().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static clarifai2.internal.grpc.api.TextOuterClass.Text parseFrom(
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
    public static Builder newBuilder(clarifai2.internal.grpc.api.TextOuterClass.Text prototype) {
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
     * Protobuf type {@code clarifai.api.Text}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:clarifai.api.Text)
        clarifai2.internal.grpc.api.TextOuterClass.TextOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return clarifai2.internal.grpc.api.TextOuterClass.internal_static_clarifai_api_Text_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return clarifai2.internal.grpc.api.TextOuterClass.internal_static_clarifai_api_Text_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                clarifai2.internal.grpc.api.TextOuterClass.Text.class, clarifai2.internal.grpc.api.TextOuterClass.Text.Builder.class);
      }

      // Construct using clarifai2.internal.grpc.api.TextOuterClass.Text.newBuilder()
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
        raw_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return clarifai2.internal.grpc.api.TextOuterClass.internal_static_clarifai_api_Text_descriptor;
      }

      public clarifai2.internal.grpc.api.TextOuterClass.Text getDefaultInstanceForType() {
        return clarifai2.internal.grpc.api.TextOuterClass.Text.getDefaultInstance();
      }

      public clarifai2.internal.grpc.api.TextOuterClass.Text build() {
        clarifai2.internal.grpc.api.TextOuterClass.Text result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public clarifai2.internal.grpc.api.TextOuterClass.Text buildPartial() {
        clarifai2.internal.grpc.api.TextOuterClass.Text result = new clarifai2.internal.grpc.api.TextOuterClass.Text(this);
        result.raw_ = raw_;
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
        if (other instanceof clarifai2.internal.grpc.api.TextOuterClass.Text) {
          return mergeFrom((clarifai2.internal.grpc.api.TextOuterClass.Text)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(clarifai2.internal.grpc.api.TextOuterClass.Text other) {
        if (other == clarifai2.internal.grpc.api.TextOuterClass.Text.getDefaultInstance()) return this;
        if (!other.getRaw().isEmpty()) {
          raw_ = other.raw_;
          onChanged();
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
        clarifai2.internal.grpc.api.TextOuterClass.Text parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (clarifai2.internal.grpc.api.TextOuterClass.Text) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object raw_ = "";
      /**
       * <code>string raw = 1;</code>
       */
      public java.lang.String getRaw() {
        java.lang.Object ref = raw_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          raw_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string raw = 1;</code>
       */
      public com.google.protobuf.ByteString
          getRawBytes() {
        java.lang.Object ref = raw_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          raw_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string raw = 1;</code>
       */
      public Builder setRaw(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        raw_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string raw = 1;</code>
       */
      public Builder clearRaw() {
        
        raw_ = getDefaultInstance().getRaw();
        onChanged();
        return this;
      }
      /**
       * <code>string raw = 1;</code>
       */
      public Builder setRawBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        raw_ = value;
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


      // @@protoc_insertion_point(builder_scope:clarifai.api.Text)
    }

    // @@protoc_insertion_point(class_scope:clarifai.api.Text)
    private static final clarifai2.internal.grpc.api.TextOuterClass.Text DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new clarifai2.internal.grpc.api.TextOuterClass.Text();
    }

    public static clarifai2.internal.grpc.api.TextOuterClass.Text getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Text>
        PARSER = new com.google.protobuf.AbstractParser<Text>() {
      public Text parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Text(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Text> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Text> getParserForType() {
      return PARSER;
    }

    public clarifai2.internal.grpc.api.TextOuterClass.Text getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_clarifai_api_Text_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_clarifai_api_Text_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035proto/clarifai/api/text.proto\022\014clarifa" +
      "i.api\"\023\n\004Text\022\013\n\003raw\030\001 \001(\tBA\n\033clarifai2." +
      "internal.grpc.apiZ\003api\242\002\004CAIP\302\002\001_\312\002\021Clar" +
      "ifai\\Internalb\006proto3"
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
    internal_static_clarifai_api_Text_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_clarifai_api_Text_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_clarifai_api_Text_descriptor,
        new java.lang.String[] { "Raw", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
