// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/device.proto

package io.chirpstack.api;

/**
 * Protobuf type {@code api.CreateDeviceRequest}
 */
public final class CreateDeviceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.CreateDeviceRequest)
    CreateDeviceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDeviceRequest.newBuilder() to construct.
  private CreateDeviceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDeviceRequest() {
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateDeviceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return DeviceProto.internal_static_api_CreateDeviceRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DeviceProto.internal_static_api_CreateDeviceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CreateDeviceRequest.class, Builder.class);
  }

  public static final int DEVICE_FIELD_NUMBER = 1;
  private Device device_;
  /**
   * <pre>
   * Device object.
   * </pre>
   *
   * <code>.api.Device device = 1;</code>
   * @return Whether the device field is set.
   */
  @Override
  public boolean hasDevice() {
    return device_ != null;
  }
  /**
   * <pre>
   * Device object.
   * </pre>
   *
   * <code>.api.Device device = 1;</code>
   * @return The device.
   */
  @Override
  public Device getDevice() {
    return device_ == null ? Device.getDefaultInstance() : device_;
  }
  /**
   * <pre>
   * Device object.
   * </pre>
   *
   * <code>.api.Device device = 1;</code>
   */
  @Override
  public DeviceOrBuilder getDeviceOrBuilder() {
    return device_ == null ? Device.getDefaultInstance() : device_;
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
    if (device_ != null) {
      output.writeMessage(1, getDevice());
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (device_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDevice());
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
    if (!(obj instanceof CreateDeviceRequest)) {
      return super.equals(obj);
    }
    CreateDeviceRequest other = (CreateDeviceRequest) obj;

    if (hasDevice() != other.hasDevice()) return false;
    if (hasDevice()) {
      if (!getDevice()
          .equals(other.getDevice())) return false;
    }
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
    if (hasDevice()) {
      hash = (37 * hash) + DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getDevice().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CreateDeviceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateDeviceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateDeviceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateDeviceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateDeviceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateDeviceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateDeviceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CreateDeviceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CreateDeviceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CreateDeviceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CreateDeviceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CreateDeviceRequest parseFrom(
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
  public static Builder newBuilder(CreateDeviceRequest prototype) {
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
   * Protobuf type {@code api.CreateDeviceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.CreateDeviceRequest)
      CreateDeviceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DeviceProto.internal_static_api_CreateDeviceRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DeviceProto.internal_static_api_CreateDeviceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CreateDeviceRequest.class, Builder.class);
    }

    // Construct using io.chirpstack.api.CreateDeviceRequest.newBuilder()
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
      device_ = null;
      if (deviceBuilder_ != null) {
        deviceBuilder_.dispose();
        deviceBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DeviceProto.internal_static_api_CreateDeviceRequest_descriptor;
    }

    @Override
    public CreateDeviceRequest getDefaultInstanceForType() {
      return CreateDeviceRequest.getDefaultInstance();
    }

    @Override
    public CreateDeviceRequest build() {
      CreateDeviceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public CreateDeviceRequest buildPartial() {
      CreateDeviceRequest result = new CreateDeviceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(CreateDeviceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.device_ = deviceBuilder_ == null
            ? device_
            : deviceBuilder_.build();
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof CreateDeviceRequest) {
        return mergeFrom((CreateDeviceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CreateDeviceRequest other) {
      if (other == CreateDeviceRequest.getDefaultInstance()) return this;
      if (other.hasDevice()) {
        mergeDevice(other.getDevice());
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
            case 10: {
              input.readMessage(
                  getDeviceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private Device device_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Device, Device.Builder, DeviceOrBuilder> deviceBuilder_;
    /**
     * <pre>
     * Device object.
     * </pre>
     *
     * <code>.api.Device device = 1;</code>
     * @return Whether the device field is set.
     */
    public boolean hasDevice() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Device object.
     * </pre>
     *
     * <code>.api.Device device = 1;</code>
     * @return The device.
     */
    public Device getDevice() {
      if (deviceBuilder_ == null) {
        return device_ == null ? Device.getDefaultInstance() : device_;
      } else {
        return deviceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Device object.
     * </pre>
     *
     * <code>.api.Device device = 1;</code>
     */
    public Builder setDevice(Device value) {
      if (deviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        device_ = value;
      } else {
        deviceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device object.
     * </pre>
     *
     * <code>.api.Device device = 1;</code>
     */
    public Builder setDevice(
        Device.Builder builderForValue) {
      if (deviceBuilder_ == null) {
        device_ = builderForValue.build();
      } else {
        deviceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device object.
     * </pre>
     *
     * <code>.api.Device device = 1;</code>
     */
    public Builder mergeDevice(Device value) {
      if (deviceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          device_ != null &&
          device_ != Device.getDefaultInstance()) {
          getDeviceBuilder().mergeFrom(value);
        } else {
          device_ = value;
        }
      } else {
        deviceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device object.
     * </pre>
     *
     * <code>.api.Device device = 1;</code>
     */
    public Builder clearDevice() {
      bitField0_ = (bitField0_ & ~0x00000001);
      device_ = null;
      if (deviceBuilder_ != null) {
        deviceBuilder_.dispose();
        deviceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Device object.
     * </pre>
     *
     * <code>.api.Device device = 1;</code>
     */
    public Device.Builder getDeviceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDeviceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Device object.
     * </pre>
     *
     * <code>.api.Device device = 1;</code>
     */
    public DeviceOrBuilder getDeviceOrBuilder() {
      if (deviceBuilder_ != null) {
        return deviceBuilder_.getMessageOrBuilder();
      } else {
        return device_ == null ?
            Device.getDefaultInstance() : device_;
      }
    }
    /**
     * <pre>
     * Device object.
     * </pre>
     *
     * <code>.api.Device device = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Device, Device.Builder, DeviceOrBuilder>
        getDeviceFieldBuilder() {
      if (deviceBuilder_ == null) {
        deviceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Device, Device.Builder, DeviceOrBuilder>(
                getDevice(),
                getParentForChildren(),
                isClean());
        device_ = null;
      }
      return deviceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.CreateDeviceRequest)
  }

  // @@protoc_insertion_point(class_scope:api.CreateDeviceRequest)
  private static final CreateDeviceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CreateDeviceRequest();
  }

  public static CreateDeviceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDeviceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateDeviceRequest>() {
    @Override
    public CreateDeviceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDeviceRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<CreateDeviceRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public CreateDeviceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
