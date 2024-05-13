// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/common.proto

// Protobuf Java Version: 3.25.1
package io.chirpstack.api;

/**
 * <pre>
 * Join-Server context.
 * </pre>
 *
 * Protobuf type {@code common.JoinServerContext}
 */
public final class JoinServerContext extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:common.JoinServerContext)
    JoinServerContextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JoinServerContext.newBuilder() to construct.
  private JoinServerContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JoinServerContext() {
    sessionKeyId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JoinServerContext();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.chirpstack.api.CommonProto.internal_static_common_JoinServerContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.chirpstack.api.CommonProto.internal_static_common_JoinServerContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.chirpstack.api.JoinServerContext.class, io.chirpstack.api.JoinServerContext.Builder.class);
  }

  private int bitField0_;
  public static final int SESSION_KEY_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sessionKeyId_ = "";
  /**
   * <pre>
   * Session-key ID.
   * </pre>
   *
   * <code>string session_key_id = 1;</code>
   * @return The sessionKeyId.
   */
  @java.lang.Override
  public java.lang.String getSessionKeyId() {
    java.lang.Object ref = sessionKeyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionKeyId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Session-key ID.
   * </pre>
   *
   * <code>string session_key_id = 1;</code>
   * @return The bytes for sessionKeyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionKeyIdBytes() {
    java.lang.Object ref = sessionKeyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionKeyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APP_S_KEY_FIELD_NUMBER = 2;
  private io.chirpstack.api.KeyEnvelope appSKey_;
  /**
   * <pre>
   * AppSKey envelope.
   * </pre>
   *
   * <code>.common.KeyEnvelope app_s_key = 2;</code>
   * @return Whether the appSKey field is set.
   */
  @java.lang.Override
  public boolean hasAppSKey() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * AppSKey envelope.
   * </pre>
   *
   * <code>.common.KeyEnvelope app_s_key = 2;</code>
   * @return The appSKey.
   */
  @java.lang.Override
  public io.chirpstack.api.KeyEnvelope getAppSKey() {
    return appSKey_ == null ? io.chirpstack.api.KeyEnvelope.getDefaultInstance() : appSKey_;
  }
  /**
   * <pre>
   * AppSKey envelope.
   * </pre>
   *
   * <code>.common.KeyEnvelope app_s_key = 2;</code>
   */
  @java.lang.Override
  public io.chirpstack.api.KeyEnvelopeOrBuilder getAppSKeyOrBuilder() {
    return appSKey_ == null ? io.chirpstack.api.KeyEnvelope.getDefaultInstance() : appSKey_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionKeyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionKeyId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAppSKey());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionKeyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionKeyId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAppSKey());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.chirpstack.api.JoinServerContext)) {
      return super.equals(obj);
    }
    io.chirpstack.api.JoinServerContext other = (io.chirpstack.api.JoinServerContext) obj;

    if (!getSessionKeyId()
        .equals(other.getSessionKeyId())) return false;
    if (hasAppSKey() != other.hasAppSKey()) return false;
    if (hasAppSKey()) {
      if (!getAppSKey()
          .equals(other.getAppSKey())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SESSION_KEY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionKeyId().hashCode();
    if (hasAppSKey()) {
      hash = (37 * hash) + APP_S_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getAppSKey().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.chirpstack.api.JoinServerContext parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.api.JoinServerContext parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.api.JoinServerContext parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.api.JoinServerContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.api.JoinServerContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.chirpstack.api.JoinServerContext parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.chirpstack.api.JoinServerContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.api.JoinServerContext parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.chirpstack.api.JoinServerContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.chirpstack.api.JoinServerContext parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.chirpstack.api.JoinServerContext parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.chirpstack.api.JoinServerContext parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.chirpstack.api.JoinServerContext prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * Join-Server context.
   * </pre>
   *
   * Protobuf type {@code common.JoinServerContext}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:common.JoinServerContext)
      io.chirpstack.api.JoinServerContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.chirpstack.api.CommonProto.internal_static_common_JoinServerContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.chirpstack.api.CommonProto.internal_static_common_JoinServerContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.chirpstack.api.JoinServerContext.class, io.chirpstack.api.JoinServerContext.Builder.class);
    }

    // Construct using io.chirpstack.api.JoinServerContext.newBuilder()
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
        getAppSKeyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sessionKeyId_ = "";
      appSKey_ = null;
      if (appSKeyBuilder_ != null) {
        appSKeyBuilder_.dispose();
        appSKeyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.chirpstack.api.CommonProto.internal_static_common_JoinServerContext_descriptor;
    }

    @java.lang.Override
    public io.chirpstack.api.JoinServerContext getDefaultInstanceForType() {
      return io.chirpstack.api.JoinServerContext.getDefaultInstance();
    }

    @java.lang.Override
    public io.chirpstack.api.JoinServerContext build() {
      io.chirpstack.api.JoinServerContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.chirpstack.api.JoinServerContext buildPartial() {
      io.chirpstack.api.JoinServerContext result = new io.chirpstack.api.JoinServerContext(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.chirpstack.api.JoinServerContext result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sessionKeyId_ = sessionKeyId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.appSKey_ = appSKeyBuilder_ == null
            ? appSKey_
            : appSKeyBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.chirpstack.api.JoinServerContext) {
        return mergeFrom((io.chirpstack.api.JoinServerContext)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.chirpstack.api.JoinServerContext other) {
      if (other == io.chirpstack.api.JoinServerContext.getDefaultInstance()) return this;
      if (!other.getSessionKeyId().isEmpty()) {
        sessionKeyId_ = other.sessionKeyId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAppSKey()) {
        mergeAppSKey(other.getAppSKey());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              sessionKeyId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAppSKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object sessionKeyId_ = "";
    /**
     * <pre>
     * Session-key ID.
     * </pre>
     *
     * <code>string session_key_id = 1;</code>
     * @return The sessionKeyId.
     */
    public java.lang.String getSessionKeyId() {
      java.lang.Object ref = sessionKeyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionKeyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Session-key ID.
     * </pre>
     *
     * <code>string session_key_id = 1;</code>
     * @return The bytes for sessionKeyId.
     */
    public com.google.protobuf.ByteString
        getSessionKeyIdBytes() {
      java.lang.Object ref = sessionKeyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionKeyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Session-key ID.
     * </pre>
     *
     * <code>string session_key_id = 1;</code>
     * @param value The sessionKeyId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionKeyId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sessionKeyId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Session-key ID.
     * </pre>
     *
     * <code>string session_key_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionKeyId() {
      sessionKeyId_ = getDefaultInstance().getSessionKeyId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Session-key ID.
     * </pre>
     *
     * <code>string session_key_id = 1;</code>
     * @param value The bytes for sessionKeyId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionKeyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sessionKeyId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private io.chirpstack.api.KeyEnvelope appSKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.chirpstack.api.KeyEnvelope, io.chirpstack.api.KeyEnvelope.Builder, io.chirpstack.api.KeyEnvelopeOrBuilder> appSKeyBuilder_;
    /**
     * <pre>
     * AppSKey envelope.
     * </pre>
     *
     * <code>.common.KeyEnvelope app_s_key = 2;</code>
     * @return Whether the appSKey field is set.
     */
    public boolean hasAppSKey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * AppSKey envelope.
     * </pre>
     *
     * <code>.common.KeyEnvelope app_s_key = 2;</code>
     * @return The appSKey.
     */
    public io.chirpstack.api.KeyEnvelope getAppSKey() {
      if (appSKeyBuilder_ == null) {
        return appSKey_ == null ? io.chirpstack.api.KeyEnvelope.getDefaultInstance() : appSKey_;
      } else {
        return appSKeyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * AppSKey envelope.
     * </pre>
     *
     * <code>.common.KeyEnvelope app_s_key = 2;</code>
     */
    public Builder setAppSKey(io.chirpstack.api.KeyEnvelope value) {
      if (appSKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        appSKey_ = value;
      } else {
        appSKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * AppSKey envelope.
     * </pre>
     *
     * <code>.common.KeyEnvelope app_s_key = 2;</code>
     */
    public Builder setAppSKey(
        io.chirpstack.api.KeyEnvelope.Builder builderForValue) {
      if (appSKeyBuilder_ == null) {
        appSKey_ = builderForValue.build();
      } else {
        appSKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * AppSKey envelope.
     * </pre>
     *
     * <code>.common.KeyEnvelope app_s_key = 2;</code>
     */
    public Builder mergeAppSKey(io.chirpstack.api.KeyEnvelope value) {
      if (appSKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          appSKey_ != null &&
          appSKey_ != io.chirpstack.api.KeyEnvelope.getDefaultInstance()) {
          getAppSKeyBuilder().mergeFrom(value);
        } else {
          appSKey_ = value;
        }
      } else {
        appSKeyBuilder_.mergeFrom(value);
      }
      if (appSKey_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * AppSKey envelope.
     * </pre>
     *
     * <code>.common.KeyEnvelope app_s_key = 2;</code>
     */
    public Builder clearAppSKey() {
      bitField0_ = (bitField0_ & ~0x00000002);
      appSKey_ = null;
      if (appSKeyBuilder_ != null) {
        appSKeyBuilder_.dispose();
        appSKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * AppSKey envelope.
     * </pre>
     *
     * <code>.common.KeyEnvelope app_s_key = 2;</code>
     */
    public io.chirpstack.api.KeyEnvelope.Builder getAppSKeyBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAppSKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * AppSKey envelope.
     * </pre>
     *
     * <code>.common.KeyEnvelope app_s_key = 2;</code>
     */
    public io.chirpstack.api.KeyEnvelopeOrBuilder getAppSKeyOrBuilder() {
      if (appSKeyBuilder_ != null) {
        return appSKeyBuilder_.getMessageOrBuilder();
      } else {
        return appSKey_ == null ?
            io.chirpstack.api.KeyEnvelope.getDefaultInstance() : appSKey_;
      }
    }
    /**
     * <pre>
     * AppSKey envelope.
     * </pre>
     *
     * <code>.common.KeyEnvelope app_s_key = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.chirpstack.api.KeyEnvelope, io.chirpstack.api.KeyEnvelope.Builder, io.chirpstack.api.KeyEnvelopeOrBuilder> 
        getAppSKeyFieldBuilder() {
      if (appSKeyBuilder_ == null) {
        appSKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.chirpstack.api.KeyEnvelope, io.chirpstack.api.KeyEnvelope.Builder, io.chirpstack.api.KeyEnvelopeOrBuilder>(
                getAppSKey(),
                getParentForChildren(),
                isClean());
        appSKey_ = null;
      }
      return appSKeyBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:common.JoinServerContext)
  }

  // @@protoc_insertion_point(class_scope:common.JoinServerContext)
  private static final io.chirpstack.api.JoinServerContext DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.chirpstack.api.JoinServerContext();
  }

  public static io.chirpstack.api.JoinServerContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JoinServerContext>
      PARSER = new com.google.protobuf.AbstractParser<JoinServerContext>() {
    @java.lang.Override
    public JoinServerContext parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<JoinServerContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JoinServerContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.chirpstack.api.JoinServerContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
