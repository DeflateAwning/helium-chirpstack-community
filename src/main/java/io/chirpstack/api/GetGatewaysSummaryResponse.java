// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/internal.proto

package io.chirpstack.api;

/**
 * Protobuf type {@code api.GetGatewaysSummaryResponse}
 */
public final class GetGatewaysSummaryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.GetGatewaysSummaryResponse)
    GetGatewaysSummaryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetGatewaysSummaryResponse.newBuilder() to construct.
  private GetGatewaysSummaryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetGatewaysSummaryResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetGatewaysSummaryResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return InternalProto.internal_static_api_GetGatewaysSummaryResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return InternalProto.internal_static_api_GetGatewaysSummaryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GetGatewaysSummaryResponse.class, Builder.class);
  }

  public static final int ONLINE_COUNT_FIELD_NUMBER = 1;
  private int onlineCount_ = 0;
  /**
   * <pre>
   * Online count.
   * </pre>
   *
   * <code>uint32 online_count = 1;</code>
   * @return The onlineCount.
   */
  @Override
  public int getOnlineCount() {
    return onlineCount_;
  }

  public static final int OFFLINE_COUNT_FIELD_NUMBER = 2;
  private int offlineCount_ = 0;
  /**
   * <pre>
   * Offline count.
   * </pre>
   *
   * <code>uint32 offline_count = 2;</code>
   * @return The offlineCount.
   */
  @Override
  public int getOfflineCount() {
    return offlineCount_;
  }

  public static final int NEVER_SEEN_COUNT_FIELD_NUMBER = 3;
  private int neverSeenCount_ = 0;
  /**
   * <pre>
   * Never seen count.
   * </pre>
   *
   * <code>uint32 never_seen_count = 3;</code>
   * @return The neverSeenCount.
   */
  @Override
  public int getNeverSeenCount() {
    return neverSeenCount_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (onlineCount_ != 0) {
      output.writeUInt32(1, onlineCount_);
    }
    if (offlineCount_ != 0) {
      output.writeUInt32(2, offlineCount_);
    }
    if (neverSeenCount_ != 0) {
      output.writeUInt32(3, neverSeenCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (onlineCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, onlineCount_);
    }
    if (offlineCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, offlineCount_);
    }
    if (neverSeenCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, neverSeenCount_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof GetGatewaysSummaryResponse)) {
      return super.equals(obj);
    }
    GetGatewaysSummaryResponse other = (GetGatewaysSummaryResponse) obj;

    if (getOnlineCount()
        != other.getOnlineCount()) return false;
    if (getOfflineCount()
        != other.getOfflineCount()) return false;
    if (getNeverSeenCount()
        != other.getNeverSeenCount()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ONLINE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getOnlineCount();
    hash = (37 * hash) + OFFLINE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getOfflineCount();
    hash = (37 * hash) + NEVER_SEEN_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getNeverSeenCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GetGatewaysSummaryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetGatewaysSummaryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetGatewaysSummaryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetGatewaysSummaryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetGatewaysSummaryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetGatewaysSummaryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetGatewaysSummaryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetGatewaysSummaryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetGatewaysSummaryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GetGatewaysSummaryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetGatewaysSummaryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetGatewaysSummaryResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(GetGatewaysSummaryResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.GetGatewaysSummaryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.GetGatewaysSummaryResponse)
      GetGatewaysSummaryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return InternalProto.internal_static_api_GetGatewaysSummaryResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return InternalProto.internal_static_api_GetGatewaysSummaryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetGatewaysSummaryResponse.class, Builder.class);
    }

    // Construct using io.chirpstack.api.GetGatewaysSummaryResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      onlineCount_ = 0;
      offlineCount_ = 0;
      neverSeenCount_ = 0;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return InternalProto.internal_static_api_GetGatewaysSummaryResponse_descriptor;
    }

    @Override
    public GetGatewaysSummaryResponse getDefaultInstanceForType() {
      return GetGatewaysSummaryResponse.getDefaultInstance();
    }

    @Override
    public GetGatewaysSummaryResponse build() {
      GetGatewaysSummaryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GetGatewaysSummaryResponse buildPartial() {
      GetGatewaysSummaryResponse result = new GetGatewaysSummaryResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(GetGatewaysSummaryResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.onlineCount_ = onlineCount_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.offlineCount_ = offlineCount_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.neverSeenCount_ = neverSeenCount_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GetGatewaysSummaryResponse) {
        return mergeFrom((GetGatewaysSummaryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GetGatewaysSummaryResponse other) {
      if (other == GetGatewaysSummaryResponse.getDefaultInstance()) return this;
      if (other.getOnlineCount() != 0) {
        setOnlineCount(other.getOnlineCount());
      }
      if (other.getOfflineCount() != 0) {
        setOfflineCount(other.getOfflineCount());
      }
      if (other.getNeverSeenCount() != 0) {
        setNeverSeenCount(other.getNeverSeenCount());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              onlineCount_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              offlineCount_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              neverSeenCount_ = input.readUInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private int onlineCount_ ;
    /**
     * <pre>
     * Online count.
     * </pre>
     *
     * <code>uint32 online_count = 1;</code>
     * @return The onlineCount.
     */
    @Override
    public int getOnlineCount() {
      return onlineCount_;
    }
    /**
     * <pre>
     * Online count.
     * </pre>
     *
     * <code>uint32 online_count = 1;</code>
     * @param value The onlineCount to set.
     * @return This builder for chaining.
     */
    public Builder setOnlineCount(int value) {

      onlineCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Online count.
     * </pre>
     *
     * <code>uint32 online_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOnlineCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      onlineCount_ = 0;
      onChanged();
      return this;
    }

    private int offlineCount_ ;
    /**
     * <pre>
     * Offline count.
     * </pre>
     *
     * <code>uint32 offline_count = 2;</code>
     * @return The offlineCount.
     */
    @Override
    public int getOfflineCount() {
      return offlineCount_;
    }
    /**
     * <pre>
     * Offline count.
     * </pre>
     *
     * <code>uint32 offline_count = 2;</code>
     * @param value The offlineCount to set.
     * @return This builder for chaining.
     */
    public Builder setOfflineCount(int value) {

      offlineCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Offline count.
     * </pre>
     *
     * <code>uint32 offline_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOfflineCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      offlineCount_ = 0;
      onChanged();
      return this;
    }

    private int neverSeenCount_ ;
    /**
     * <pre>
     * Never seen count.
     * </pre>
     *
     * <code>uint32 never_seen_count = 3;</code>
     * @return The neverSeenCount.
     */
    @Override
    public int getNeverSeenCount() {
      return neverSeenCount_;
    }
    /**
     * <pre>
     * Never seen count.
     * </pre>
     *
     * <code>uint32 never_seen_count = 3;</code>
     * @param value The neverSeenCount to set.
     * @return This builder for chaining.
     */
    public Builder setNeverSeenCount(int value) {

      neverSeenCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Never seen count.
     * </pre>
     *
     * <code>uint32 never_seen_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNeverSeenCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      neverSeenCount_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.GetGatewaysSummaryResponse)
  }

  // @@protoc_insertion_point(class_scope:api.GetGatewaysSummaryResponse)
  private static final GetGatewaysSummaryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetGatewaysSummaryResponse();
  }

  public static GetGatewaysSummaryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetGatewaysSummaryResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetGatewaysSummaryResponse>() {
    @Override
    public GetGatewaysSummaryResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetGatewaysSummaryResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetGatewaysSummaryResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public GetGatewaysSummaryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

