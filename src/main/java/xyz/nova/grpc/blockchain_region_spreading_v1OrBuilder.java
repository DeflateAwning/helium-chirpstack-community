// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blockchain_region_param_v1.proto

package xyz.nova.grpc;

public interface blockchain_region_spreading_v1OrBuilder extends
    // @@protoc_insertion_point(interface_extends:helium.blockchain_region_spreading_v1)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
   */
  java.util.List<xyz.nova.grpc.tagged_spreading> 
      getTaggedSpreadingList();
  /**
   * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
   */
  xyz.nova.grpc.tagged_spreading getTaggedSpreading(int index);
  /**
   * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
   */
  int getTaggedSpreadingCount();
  /**
   * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
   */
  java.util.List<? extends xyz.nova.grpc.tagged_spreadingOrBuilder> 
      getTaggedSpreadingOrBuilderList();
  /**
   * <code>repeated .helium.tagged_spreading tagged_spreading = 1;</code>
   */
  xyz.nova.grpc.tagged_spreadingOrBuilder getTaggedSpreadingOrBuilder(
      int index);
}