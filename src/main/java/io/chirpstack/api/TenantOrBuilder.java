// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/tenant.proto

package io.chirpstack.api;

public interface TenantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.Tenant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Tenant ID (UUID).
   * Note: this value will be automatically generated on create.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Tenant ID (UUID).
   * Note: this value will be automatically generated on create.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Tenant name,
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Tenant name,
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Tenant description.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Tenant description.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Can the tenant create and "own" Gateways?
   * </pre>
   *
   * <code>bool can_have_gateways = 4;</code>
   * @return The canHaveGateways.
   */
  boolean getCanHaveGateways();

  /**
   * <pre>
   * Max. gateway count for tenant.
   * When set to 0, the tenant can have unlimited gateways.
   * </pre>
   *
   * <code>uint32 max_gateway_count = 5;</code>
   * @return The maxGatewayCount.
   */
  int getMaxGatewayCount();

  /**
   * <pre>
   * Max. device count for tenant.
   * When set to 0, the tenant can have unlimited devices.
   * </pre>
   *
   * <code>uint32 max_device_count = 6;</code>
   * @return The maxDeviceCount.
   */
  int getMaxDeviceCount();

  /**
   * <pre>
   * Private gateways (uplink).
   * If enabled, then uplink messages will not be shared with other tenants.
   * </pre>
   *
   * <code>bool private_gateways_up = 7;</code>
   * @return The privateGatewaysUp.
   */
  boolean getPrivateGatewaysUp();

  /**
   * <pre>
   * Private gateways (downlink).
   * If enabled, then other tenants will not be able to schedule downlink
   * messages through the gateways of this tenant. For example, in case you
   * do want to share uplinks with other tenants (private_gateways_up=false),
   * but you want to prevent other tenants from using gateway airtime.
   * </pre>
   *
   * <code>bool private_gateways_down = 8;</code>
   * @return The privateGatewaysDown.
   */
  boolean getPrivateGatewaysDown();

  /**
   * <pre>
   * Tags (user defined).
   * These tags can be used to add additional information to the tenant. These
   * tags are NOT exposed in the integration events.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 9;</code>
   */
  int getTagsCount();
  /**
   * <pre>
   * Tags (user defined).
   * These tags can be used to add additional information to the tenant. These
   * tags are NOT exposed in the integration events.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 9;</code>
   */
  boolean containsTags(
      java.lang.String key);
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTags();
  /**
   * <pre>
   * Tags (user defined).
   * These tags can be used to add additional information to the tenant. These
   * tags are NOT exposed in the integration events.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTagsMap();
  /**
   * <pre>
   * Tags (user defined).
   * These tags can be used to add additional information to the tenant. These
   * tags are NOT exposed in the integration events.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 9;</code>
   */
  /* nullable */
java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Tags (user defined).
   * These tags can be used to add additional information to the tenant. These
   * tags are NOT exposed in the integration events.
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 9;</code>
   */
  java.lang.String getTagsOrThrow(
      java.lang.String key);
}
