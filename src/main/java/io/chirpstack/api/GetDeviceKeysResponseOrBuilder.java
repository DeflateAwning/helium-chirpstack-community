// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/device.proto

package io.chirpstack.api;

public interface GetDeviceKeysResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.GetDeviceKeysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Device-keys object.
   * </pre>
   *
   * <code>.api.DeviceKeys device_keys = 1;</code>
   * @return Whether the deviceKeys field is set.
   */
  boolean hasDeviceKeys();
  /**
   * <pre>
   * Device-keys object.
   * </pre>
   *
   * <code>.api.DeviceKeys device_keys = 1;</code>
   * @return The deviceKeys.
   */
  DeviceKeys getDeviceKeys();
  /**
   * <pre>
   * Device-keys object.
   * </pre>
   *
   * <code>.api.DeviceKeys device_keys = 1;</code>
   */
  DeviceKeysOrBuilder getDeviceKeysOrBuilder();

  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <pre>
   * Created at timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp created_at = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <pre>
   * Last update timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp updated_at = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();
}
