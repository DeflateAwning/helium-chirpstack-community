// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/user.proto

package io.chirpstack.api;

public interface ListUsersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.ListUsersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Max number of tenants to return in the result-set.
   * </pre>
   *
   * <code>uint32 limit = 1;</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <pre>
   * Offset in the result-set (for pagination).
   * </pre>
   *
   * <code>uint32 offset = 2;</code>
   * @return The offset.
   */
  int getOffset();
}
