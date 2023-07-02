// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/internal.proto

package io.chirpstack.api;

public interface UserTenantLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.UserTenantLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 1;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 1;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 2;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 2;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <pre>
   * Tenant ID.
   * </pre>
   *
   * <code>string tenant_id = 3;</code>
   * @return The tenantId.
   */
  String getTenantId();
  /**
   * <pre>
   * Tenant ID.
   * </pre>
   *
   * <code>string tenant_id = 3;</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();

  /**
   * <pre>
   * User is admin within the context of this tenant.
   * There is no need to set the is_device_admin and is_gateway_admin flags.
   * </pre>
   *
   * <code>bool is_admin = 4;</code>
   * @return The isAdmin.
   */
  boolean getIsAdmin();

  /**
   * <pre>
   * User is able to modify device related resources (applications,
   * device-profiles, devices, multicast-groups).
   * </pre>
   *
   * <code>bool is_device_admin = 5;</code>
   * @return The isDeviceAdmin.
   */
  boolean getIsDeviceAdmin();

  /**
   * <pre>
   * User is able to modify gateways.
   * </pre>
   *
   * <code>bool is_gateway_admin = 6;</code>
   * @return The isGatewayAdmin.
   */
  boolean getIsGatewayAdmin();
}