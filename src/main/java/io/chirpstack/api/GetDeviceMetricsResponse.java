// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/device.proto

package io.chirpstack.api;

/**
 * Protobuf type {@code api.GetDeviceMetricsResponse}
 */
public final class GetDeviceMetricsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.GetDeviceMetricsResponse)
    GetDeviceMetricsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetDeviceMetricsResponse.newBuilder() to construct.
  private GetDeviceMetricsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetDeviceMetricsResponse() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetDeviceMetricsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return DeviceProto.internal_static_api_GetDeviceMetricsResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetMetrics();
      case 2:
        return internalGetStates();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DeviceProto.internal_static_api_GetDeviceMetricsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GetDeviceMetricsResponse.class, Builder.class);
  }

  public static final int METRICS_FIELD_NUMBER = 1;
  private static final class MetricsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        String, io.chirpstack.api.Metric> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, io.chirpstack.api.Metric>newDefaultInstance(
                DeviceProto.internal_static_api_GetDeviceMetricsResponse_MetricsEntry_descriptor,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.chirpstack.api.Metric.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      String, io.chirpstack.api.Metric> metrics_;
  private com.google.protobuf.MapField<String, io.chirpstack.api.Metric>
  internalGetMetrics() {
    if (metrics_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MetricsDefaultEntryHolder.defaultEntry);
    }
    return metrics_;
  }
  public int getMetricsCount() {
    return internalGetMetrics().getMap().size();
  }
  /**
   * <code>map&lt;string, .common.Metric&gt; metrics = 1;</code>
   */
  @Override
  public boolean containsMetrics(
      String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetMetrics().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMetricsMap()} instead.
   */
  @Override
  @Deprecated
  public java.util.Map<String, io.chirpstack.api.Metric> getMetrics() {
    return getMetricsMap();
  }
  /**
   * <code>map&lt;string, .common.Metric&gt; metrics = 1;</code>
   */
  @Override
  public java.util.Map<String, io.chirpstack.api.Metric> getMetricsMap() {
    return internalGetMetrics().getMap();
  }
  /**
   * <code>map&lt;string, .common.Metric&gt; metrics = 1;</code>
   */
  @Override
  public /* nullable */
io.chirpstack.api.Metric getMetricsOrDefault(
      String key,
      /* nullable */
io.chirpstack.api.Metric defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<String, io.chirpstack.api.Metric> map =
        internalGetMetrics().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .common.Metric&gt; metrics = 1;</code>
   */
  @Override
  public io.chirpstack.api.Metric getMetricsOrThrow(
      String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<String, io.chirpstack.api.Metric> map =
        internalGetMetrics().getMap();
    if (!map.containsKey(key)) {
      throw new IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int STATES_FIELD_NUMBER = 2;
  private static final class StatesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        String, DeviceState> defaultEntry =
            com.google.protobuf.MapEntry
            .<String, DeviceState>newDefaultInstance(
                DeviceProto.internal_static_api_GetDeviceMetricsResponse_StatesEntry_descriptor,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                DeviceState.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      String, DeviceState> states_;
  private com.google.protobuf.MapField<String, DeviceState>
  internalGetStates() {
    if (states_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          StatesDefaultEntryHolder.defaultEntry);
    }
    return states_;
  }
  public int getStatesCount() {
    return internalGetStates().getMap().size();
  }
  /**
   * <code>map&lt;string, .api.DeviceState&gt; states = 2;</code>
   */
  @Override
  public boolean containsStates(
      String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetStates().getMap().containsKey(key);
  }
  /**
   * Use {@link #getStatesMap()} instead.
   */
  @Override
  @Deprecated
  public java.util.Map<String, DeviceState> getStates() {
    return getStatesMap();
  }
  /**
   * <code>map&lt;string, .api.DeviceState&gt; states = 2;</code>
   */
  @Override
  public java.util.Map<String, DeviceState> getStatesMap() {
    return internalGetStates().getMap();
  }
  /**
   * <code>map&lt;string, .api.DeviceState&gt; states = 2;</code>
   */
  @Override
  public /* nullable */
DeviceState getStatesOrDefault(
      String key,
      /* nullable */
DeviceState defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<String, DeviceState> map =
        internalGetStates().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .api.DeviceState&gt; states = 2;</code>
   */
  @Override
  public DeviceState getStatesOrThrow(
      String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<String, DeviceState> map =
        internalGetStates().getMap();
    if (!map.containsKey(key)) {
      throw new IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMetrics(),
        MetricsDefaultEntryHolder.defaultEntry,
        1);
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetStates(),
        StatesDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<String, io.chirpstack.api.Metric> entry
         : internalGetMetrics().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, io.chirpstack.api.Metric>
      metrics__ = MetricsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, metrics__);
    }
    for (java.util.Map.Entry<String, DeviceState> entry
         : internalGetStates().getMap().entrySet()) {
      com.google.protobuf.MapEntry<String, DeviceState>
      states__ = StatesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, states__);
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
    if (!(obj instanceof GetDeviceMetricsResponse)) {
      return super.equals(obj);
    }
    GetDeviceMetricsResponse other = (GetDeviceMetricsResponse) obj;

    if (!internalGetMetrics().equals(
        other.internalGetMetrics())) return false;
    if (!internalGetStates().equals(
        other.internalGetStates())) return false;
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
    if (!internalGetMetrics().getMap().isEmpty()) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMetrics().hashCode();
    }
    if (!internalGetStates().getMap().isEmpty()) {
      hash = (37 * hash) + STATES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetStates().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GetDeviceMetricsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetDeviceMetricsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetDeviceMetricsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetDeviceMetricsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetDeviceMetricsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetDeviceMetricsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetDeviceMetricsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetDeviceMetricsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetDeviceMetricsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GetDeviceMetricsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetDeviceMetricsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetDeviceMetricsResponse parseFrom(
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
  public static Builder newBuilder(GetDeviceMetricsResponse prototype) {
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
   * Protobuf type {@code api.GetDeviceMetricsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.GetDeviceMetricsResponse)
      GetDeviceMetricsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DeviceProto.internal_static_api_GetDeviceMetricsResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMetrics();
        case 2:
          return internalGetStates();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableMetrics();
        case 2:
          return internalGetMutableStates();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DeviceProto.internal_static_api_GetDeviceMetricsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetDeviceMetricsResponse.class, Builder.class);
    }

    // Construct using io.chirpstack.api.GetDeviceMetricsResponse.newBuilder()
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
      internalGetMutableMetrics().clear();
      internalGetMutableStates().clear();
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DeviceProto.internal_static_api_GetDeviceMetricsResponse_descriptor;
    }

    @Override
    public GetDeviceMetricsResponse getDefaultInstanceForType() {
      return GetDeviceMetricsResponse.getDefaultInstance();
    }

    @Override
    public GetDeviceMetricsResponse build() {
      GetDeviceMetricsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public GetDeviceMetricsResponse buildPartial() {
      GetDeviceMetricsResponse result = new GetDeviceMetricsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(GetDeviceMetricsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metrics_ = internalGetMetrics();
        result.metrics_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.states_ = internalGetStates();
        result.states_.makeImmutable();
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GetDeviceMetricsResponse) {
        return mergeFrom((GetDeviceMetricsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GetDeviceMetricsResponse other) {
      if (other == GetDeviceMetricsResponse.getDefaultInstance()) return this;
      internalGetMutableMetrics().mergeFrom(
          other.internalGetMetrics());
      bitField0_ |= 0x00000001;
      internalGetMutableStates().mergeFrom(
          other.internalGetStates());
      bitField0_ |= 0x00000002;
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
            case 10: {
              com.google.protobuf.MapEntry<String, io.chirpstack.api.Metric>
              metrics__ = input.readMessage(
                  MetricsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableMetrics().getMutableMap().put(
                  metrics__.getKey(), metrics__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<String, DeviceState>
              states__ = input.readMessage(
                  StatesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableStates().getMutableMap().put(
                  states__.getKey(), states__.getValue());
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

    private com.google.protobuf.MapField<
        String, io.chirpstack.api.Metric> metrics_;
    private com.google.protobuf.MapField<String, io.chirpstack.api.Metric>
        internalGetMetrics() {
      if (metrics_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MetricsDefaultEntryHolder.defaultEntry);
      }
      return metrics_;
    }
    private com.google.protobuf.MapField<String, io.chirpstack.api.Metric>
        internalGetMutableMetrics() {
      if (metrics_ == null) {
        metrics_ = com.google.protobuf.MapField.newMapField(
            MetricsDefaultEntryHolder.defaultEntry);
      }
      if (!metrics_.isMutable()) {
        metrics_ = metrics_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return metrics_;
    }
    public int getMetricsCount() {
      return internalGetMetrics().getMap().size();
    }
    /**
     * <code>map&lt;string, .common.Metric&gt; metrics = 1;</code>
     */
    @Override
    public boolean containsMetrics(
        String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetMetrics().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMetricsMap()} instead.
     */
    @Override
    @Deprecated
    public java.util.Map<String, io.chirpstack.api.Metric> getMetrics() {
      return getMetricsMap();
    }
    /**
     * <code>map&lt;string, .common.Metric&gt; metrics = 1;</code>
     */
    @Override
    public java.util.Map<String, io.chirpstack.api.Metric> getMetricsMap() {
      return internalGetMetrics().getMap();
    }
    /**
     * <code>map&lt;string, .common.Metric&gt; metrics = 1;</code>
     */
    @Override
    public /* nullable */
io.chirpstack.api.Metric getMetricsOrDefault(
        String key,
        /* nullable */
io.chirpstack.api.Metric defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<String, io.chirpstack.api.Metric> map =
          internalGetMetrics().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .common.Metric&gt; metrics = 1;</code>
     */
    @Override
    public io.chirpstack.api.Metric getMetricsOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<String, io.chirpstack.api.Metric> map =
          internalGetMetrics().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearMetrics() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableMetrics().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .common.Metric&gt; metrics = 1;</code>
     */
    public Builder removeMetrics(
        String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableMetrics().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @Deprecated
    public java.util.Map<String, io.chirpstack.api.Metric>
        getMutableMetrics() {
      bitField0_ |= 0x00000001;
      return internalGetMutableMetrics().getMutableMap();
    }
    /**
     * <code>map&lt;string, .common.Metric&gt; metrics = 1;</code>
     */
    public Builder putMetrics(
        String key,
        io.chirpstack.api.Metric value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableMetrics().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, .common.Metric&gt; metrics = 1;</code>
     */
    public Builder putAllMetrics(
        java.util.Map<String, io.chirpstack.api.Metric> values) {
      internalGetMutableMetrics().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private com.google.protobuf.MapField<
        String, DeviceState> states_;
    private com.google.protobuf.MapField<String, DeviceState>
        internalGetStates() {
      if (states_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            StatesDefaultEntryHolder.defaultEntry);
      }
      return states_;
    }
    private com.google.protobuf.MapField<String, DeviceState>
        internalGetMutableStates() {
      if (states_ == null) {
        states_ = com.google.protobuf.MapField.newMapField(
            StatesDefaultEntryHolder.defaultEntry);
      }
      if (!states_.isMutable()) {
        states_ = states_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return states_;
    }
    public int getStatesCount() {
      return internalGetStates().getMap().size();
    }
    /**
     * <code>map&lt;string, .api.DeviceState&gt; states = 2;</code>
     */
    @Override
    public boolean containsStates(
        String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetStates().getMap().containsKey(key);
    }
    /**
     * Use {@link #getStatesMap()} instead.
     */
    @Override
    @Deprecated
    public java.util.Map<String, DeviceState> getStates() {
      return getStatesMap();
    }
    /**
     * <code>map&lt;string, .api.DeviceState&gt; states = 2;</code>
     */
    @Override
    public java.util.Map<String, DeviceState> getStatesMap() {
      return internalGetStates().getMap();
    }
    /**
     * <code>map&lt;string, .api.DeviceState&gt; states = 2;</code>
     */
    @Override
    public /* nullable */
DeviceState getStatesOrDefault(
        String key,
        /* nullable */
DeviceState defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<String, DeviceState> map =
          internalGetStates().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .api.DeviceState&gt; states = 2;</code>
     */
    @Override
    public DeviceState getStatesOrThrow(
        String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<String, DeviceState> map =
          internalGetStates().getMap();
      if (!map.containsKey(key)) {
        throw new IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearStates() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableStates().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .api.DeviceState&gt; states = 2;</code>
     */
    public Builder removeStates(
        String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableStates().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @Deprecated
    public java.util.Map<String, DeviceState>
        getMutableStates() {
      bitField0_ |= 0x00000002;
      return internalGetMutableStates().getMutableMap();
    }
    /**
     * <code>map&lt;string, .api.DeviceState&gt; states = 2;</code>
     */
    public Builder putStates(
        String key,
        DeviceState value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableStates().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>map&lt;string, .api.DeviceState&gt; states = 2;</code>
     */
    public Builder putAllStates(
        java.util.Map<String, DeviceState> values) {
      internalGetMutableStates().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:api.GetDeviceMetricsResponse)
  }

  // @@protoc_insertion_point(class_scope:api.GetDeviceMetricsResponse)
  private static final GetDeviceMetricsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetDeviceMetricsResponse();
  }

  public static GetDeviceMetricsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDeviceMetricsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetDeviceMetricsResponse>() {
    @Override
    public GetDeviceMetricsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetDeviceMetricsResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetDeviceMetricsResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public GetDeviceMetricsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

