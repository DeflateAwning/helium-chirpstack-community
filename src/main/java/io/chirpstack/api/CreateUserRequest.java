// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/user.proto

package io.chirpstack.api;

/**
 * Protobuf type {@code api.CreateUserRequest}
 */
public final class CreateUserRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.CreateUserRequest)
    CreateUserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateUserRequest.newBuilder() to construct.
  private CreateUserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateUserRequest() {
    password_ = "";
    tenants_ = java.util.Collections.emptyList();
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateUserRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return UserProto.internal_static_api_CreateUserRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return UserProto.internal_static_api_CreateUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            CreateUserRequest.class, Builder.class);
  }

  public static final int USER_FIELD_NUMBER = 1;
  private User user_;
  /**
   * <pre>
   * User object to create.
   * </pre>
   *
   * <code>.api.User user = 1;</code>
   * @return Whether the user field is set.
   */
  @Override
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <pre>
   * User object to create.
   * </pre>
   *
   * <code>.api.User user = 1;</code>
   * @return The user.
   */
  @Override
  public User getUser() {
    return user_ == null ? User.getDefaultInstance() : user_;
  }
  /**
   * <pre>
   * User object to create.
   * </pre>
   *
   * <code>.api.User user = 1;</code>
   */
  @Override
  public UserOrBuilder getUserOrBuilder() {
    return user_ == null ? User.getDefaultInstance() : user_;
  }

  public static final int PASSWORD_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile Object password_ = "";
  /**
   * <pre>
   * Password to set for the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   * @return The password.
   */
  @Override
  public String getPassword() {
    Object ref = password_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Password to set for the user.
   * </pre>
   *
   * <code>string password = 2;</code>
   * @return The bytes for password.
   */
  @Override
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    Object ref = password_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENANTS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<UserTenant> tenants_;
  /**
   * <pre>
   * Add the user to the following tenants.
   * </pre>
   *
   * <code>repeated .api.UserTenant tenants = 3;</code>
   */
  @Override
  public java.util.List<UserTenant> getTenantsList() {
    return tenants_;
  }
  /**
   * <pre>
   * Add the user to the following tenants.
   * </pre>
   *
   * <code>repeated .api.UserTenant tenants = 3;</code>
   */
  @Override
  public java.util.List<? extends UserTenantOrBuilder>
      getTenantsOrBuilderList() {
    return tenants_;
  }
  /**
   * <pre>
   * Add the user to the following tenants.
   * </pre>
   *
   * <code>repeated .api.UserTenant tenants = 3;</code>
   */
  @Override
  public int getTenantsCount() {
    return tenants_.size();
  }
  /**
   * <pre>
   * Add the user to the following tenants.
   * </pre>
   *
   * <code>repeated .api.UserTenant tenants = 3;</code>
   */
  @Override
  public UserTenant getTenants(int index) {
    return tenants_.get(index);
  }
  /**
   * <pre>
   * Add the user to the following tenants.
   * </pre>
   *
   * <code>repeated .api.UserTenant tenants = 3;</code>
   */
  @Override
  public UserTenantOrBuilder getTenantsOrBuilder(
      int index) {
    return tenants_.get(index);
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
    if (user_ != null) {
      output.writeMessage(1, getUser());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, password_);
    }
    for (int i = 0; i < tenants_.size(); i++) {
      output.writeMessage(3, tenants_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUser());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, password_);
    }
    for (int i = 0; i < tenants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, tenants_.get(i));
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
    if (!(obj instanceof CreateUserRequest)) {
      return super.equals(obj);
    }
    CreateUserRequest other = (CreateUserRequest) obj;

    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (!getPassword()
        .equals(other.getPassword())) return false;
    if (!getTenantsList()
        .equals(other.getTenantsList())) return false;
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
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    if (getTenantsCount() > 0) {
      hash = (37 * hash) + TENANTS_FIELD_NUMBER;
      hash = (53 * hash) + getTenantsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static CreateUserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateUserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static CreateUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static CreateUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CreateUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static CreateUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static CreateUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static CreateUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static CreateUserRequest parseFrom(
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
  public static Builder newBuilder(CreateUserRequest prototype) {
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
   * Protobuf type {@code api.CreateUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.CreateUserRequest)
      CreateUserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return UserProto.internal_static_api_CreateUserRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return UserProto.internal_static_api_CreateUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CreateUserRequest.class, Builder.class);
    }

    // Construct using io.chirpstack.api.CreateUserRequest.newBuilder()
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
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      password_ = "";
      if (tenantsBuilder_ == null) {
        tenants_ = java.util.Collections.emptyList();
      } else {
        tenants_ = null;
        tenantsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return UserProto.internal_static_api_CreateUserRequest_descriptor;
    }

    @Override
    public CreateUserRequest getDefaultInstanceForType() {
      return CreateUserRequest.getDefaultInstance();
    }

    @Override
    public CreateUserRequest build() {
      CreateUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public CreateUserRequest buildPartial() {
      CreateUserRequest result = new CreateUserRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(CreateUserRequest result) {
      if (tenantsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          tenants_ = java.util.Collections.unmodifiableList(tenants_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.tenants_ = tenants_;
      } else {
        result.tenants_ = tenantsBuilder_.build();
      }
    }

    private void buildPartial0(CreateUserRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.user_ = userBuilder_ == null
            ? user_
            : userBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.password_ = password_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof CreateUserRequest) {
        return mergeFrom((CreateUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(CreateUserRequest other) {
      if (other == CreateUserRequest.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (tenantsBuilder_ == null) {
        if (!other.tenants_.isEmpty()) {
          if (tenants_.isEmpty()) {
            tenants_ = other.tenants_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureTenantsIsMutable();
            tenants_.addAll(other.tenants_);
          }
          onChanged();
        }
      } else {
        if (!other.tenants_.isEmpty()) {
          if (tenantsBuilder_.isEmpty()) {
            tenantsBuilder_.dispose();
            tenantsBuilder_ = null;
            tenants_ = other.tenants_;
            bitField0_ = (bitField0_ & ~0x00000004);
            tenantsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTenantsFieldBuilder() : null;
          } else {
            tenantsBuilder_.addAllMessages(other.tenants_);
          }
        }
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
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              password_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              UserTenant m =
                  input.readMessage(
                      UserTenant.parser(),
                      extensionRegistry);
              if (tenantsBuilder_ == null) {
                ensureTenantsIsMutable();
                tenants_.add(m);
              } else {
                tenantsBuilder_.addMessage(m);
              }
              break;
            } // case 26
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

    private User user_;
    private com.google.protobuf.SingleFieldBuilderV3<
        User, User.Builder, UserOrBuilder> userBuilder_;
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     * @return The user.
     */
    public User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public Builder setUser(User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
      } else {
        userBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public Builder setUser(
        User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public Builder mergeUser(User value) {
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          user_ != null &&
          user_ != User.getDefaultInstance()) {
          getUserBuilder().mergeFrom(value);
        } else {
          user_ = value;
        }
      } else {
        userBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public Builder clearUser() {
      bitField0_ = (bitField0_ & ~0x00000001);
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public User.Builder getUserBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    public UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            User.getDefaultInstance() : user_;
      }
    }
    /**
     * <pre>
     * User object to create.
     * </pre>
     *
     * <code>.api.User user = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        User, User.Builder, UserOrBuilder>
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            User, User.Builder, UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private Object password_ = "";
    /**
     * <pre>
     * Password to set for the user.
     * </pre>
     *
     * <code>string password = 2;</code>
     * @return The password.
     */
    public String getPassword() {
      Object ref = password_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Password to set for the user.
     * </pre>
     *
     * <code>string password = 2;</code>
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Password to set for the user.
     * </pre>
     *
     * <code>string password = 2;</code>
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      password_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Password to set for the user.
     * </pre>
     *
     * <code>string password = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      password_ = getDefaultInstance().getPassword();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Password to set for the user.
     * </pre>
     *
     * <code>string password = 2;</code>
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      password_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<UserTenant> tenants_ =
      java.util.Collections.emptyList();
    private void ensureTenantsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        tenants_ = new java.util.ArrayList<UserTenant>(tenants_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        UserTenant, UserTenant.Builder, UserTenantOrBuilder> tenantsBuilder_;

    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public java.util.List<UserTenant> getTenantsList() {
      if (tenantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tenants_);
      } else {
        return tenantsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public int getTenantsCount() {
      if (tenantsBuilder_ == null) {
        return tenants_.size();
      } else {
        return tenantsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public UserTenant getTenants(int index) {
      if (tenantsBuilder_ == null) {
        return tenants_.get(index);
      } else {
        return tenantsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder setTenants(
        int index, UserTenant value) {
      if (tenantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTenantsIsMutable();
        tenants_.set(index, value);
        onChanged();
      } else {
        tenantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder setTenants(
        int index, UserTenant.Builder builderForValue) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.set(index, builderForValue.build());
        onChanged();
      } else {
        tenantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder addTenants(UserTenant value) {
      if (tenantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTenantsIsMutable();
        tenants_.add(value);
        onChanged();
      } else {
        tenantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder addTenants(
        int index, UserTenant value) {
      if (tenantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTenantsIsMutable();
        tenants_.add(index, value);
        onChanged();
      } else {
        tenantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder addTenants(
        UserTenant.Builder builderForValue) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.add(builderForValue.build());
        onChanged();
      } else {
        tenantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder addTenants(
        int index, UserTenant.Builder builderForValue) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.add(index, builderForValue.build());
        onChanged();
      } else {
        tenantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder addAllTenants(
        Iterable<? extends UserTenant> values) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tenants_);
        onChanged();
      } else {
        tenantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder clearTenants() {
      if (tenantsBuilder_ == null) {
        tenants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        tenantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public Builder removeTenants(int index) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.remove(index);
        onChanged();
      } else {
        tenantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public UserTenant.Builder getTenantsBuilder(
        int index) {
      return getTenantsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public UserTenantOrBuilder getTenantsOrBuilder(
        int index) {
      if (tenantsBuilder_ == null) {
        return tenants_.get(index);  } else {
        return tenantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public java.util.List<? extends UserTenantOrBuilder>
         getTenantsOrBuilderList() {
      if (tenantsBuilder_ != null) {
        return tenantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tenants_);
      }
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public UserTenant.Builder addTenantsBuilder() {
      return getTenantsFieldBuilder().addBuilder(
          UserTenant.getDefaultInstance());
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public UserTenant.Builder addTenantsBuilder(
        int index) {
      return getTenantsFieldBuilder().addBuilder(
          index, UserTenant.getDefaultInstance());
    }
    /**
     * <pre>
     * Add the user to the following tenants.
     * </pre>
     *
     * <code>repeated .api.UserTenant tenants = 3;</code>
     */
    public java.util.List<UserTenant.Builder>
         getTenantsBuilderList() {
      return getTenantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        UserTenant, UserTenant.Builder, UserTenantOrBuilder>
        getTenantsFieldBuilder() {
      if (tenantsBuilder_ == null) {
        tenantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            UserTenant, UserTenant.Builder, UserTenantOrBuilder>(
                tenants_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        tenants_ = null;
      }
      return tenantsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:api.CreateUserRequest)
  }

  // @@protoc_insertion_point(class_scope:api.CreateUserRequest)
  private static final CreateUserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new CreateUserRequest();
  }

  public static CreateUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateUserRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateUserRequest>() {
    @Override
    public CreateUserRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateUserRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<CreateUserRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public CreateUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
