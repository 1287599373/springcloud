package com.zt.sms.mixcloud.provider.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: SMS_P3.proto")
public final class SMSServiceGrpc {

  private SMSServiceGrpc() {}

  public static final String SERVICE_NAME = "com.zt.sms.mixcloud.provider.grpc.proto.SMSService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<SMS.CustomizeSendSMSRequest,
      SMS.CustomizeSendSMSResponse> getSendSmsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendSms",
      requestType = SMS.CustomizeSendSMSRequest.class,
      responseType = SMS.CustomizeSendSMSResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SMS.CustomizeSendSMSRequest,
      SMS.CustomizeSendSMSResponse> getSendSmsMethod() {
    io.grpc.MethodDescriptor<SMS.CustomizeSendSMSRequest, SMS.CustomizeSendSMSResponse> getSendSmsMethod;
    if ((getSendSmsMethod = SMSServiceGrpc.getSendSmsMethod) == null) {
      synchronized (SMSServiceGrpc.class) {
        if ((getSendSmsMethod = SMSServiceGrpc.getSendSmsMethod) == null) {
          SMSServiceGrpc.getSendSmsMethod = getSendSmsMethod = 
              io.grpc.MethodDescriptor.<SMS.CustomizeSendSMSRequest, SMS.CustomizeSendSMSResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.zt.sms.mixcloud.provider.grpc.proto.SMSService", "sendSms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SMS.CustomizeSendSMSRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SMS.CustomizeSendSMSResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SMSServiceMethodDescriptorSupplier("sendSms"))
                  .build();
          }
        }
     }
     return getSendSmsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SMS.PullReplyRequest,
      SMS.PullReplyResponse> getPullReplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pullReply",
      requestType = SMS.PullReplyRequest.class,
      responseType = SMS.PullReplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SMS.PullReplyRequest,
      SMS.PullReplyResponse> getPullReplyMethod() {
    io.grpc.MethodDescriptor<SMS.PullReplyRequest, SMS.PullReplyResponse> getPullReplyMethod;
    if ((getPullReplyMethod = SMSServiceGrpc.getPullReplyMethod) == null) {
      synchronized (SMSServiceGrpc.class) {
        if ((getPullReplyMethod = SMSServiceGrpc.getPullReplyMethod) == null) {
          SMSServiceGrpc.getPullReplyMethod = getPullReplyMethod = 
              io.grpc.MethodDescriptor.<SMS.PullReplyRequest, SMS.PullReplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.zt.sms.mixcloud.provider.grpc.proto.SMSService", "pullReply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SMS.PullReplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SMS.PullReplyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SMSServiceMethodDescriptorSupplier("pullReply"))
                  .build();
          }
        }
     }
     return getPullReplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SMS.PullReportRequest,
      SMS.PullReportResponse> getPullReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pullReport",
      requestType = SMS.PullReportRequest.class,
      responseType = SMS.PullReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SMS.PullReportRequest,
      SMS.PullReportResponse> getPullReportMethod() {
    io.grpc.MethodDescriptor<SMS.PullReportRequest, SMS.PullReportResponse> getPullReportMethod;
    if ((getPullReportMethod = SMSServiceGrpc.getPullReportMethod) == null) {
      synchronized (SMSServiceGrpc.class) {
        if ((getPullReportMethod = SMSServiceGrpc.getPullReportMethod) == null) {
          SMSServiceGrpc.getPullReportMethod = getPullReportMethod = 
              io.grpc.MethodDescriptor.<SMS.PullReportRequest, SMS.PullReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.zt.sms.mixcloud.provider.grpc.proto.SMSService", "pullReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SMS.PullReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SMS.PullReportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SMSServiceMethodDescriptorSupplier("pullReport"))
                  .build();
          }
        }
     }
     return getPullReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<SMS.PullReportRequest,
      SMS.PullReportResponse> getPullReportMergeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pullReportMerge",
      requestType = SMS.PullReportRequest.class,
      responseType = SMS.PullReportResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<SMS.PullReportRequest,
      SMS.PullReportResponse> getPullReportMergeMethod() {
    io.grpc.MethodDescriptor<SMS.PullReportRequest, SMS.PullReportResponse> getPullReportMergeMethod;
    if ((getPullReportMergeMethod = SMSServiceGrpc.getPullReportMergeMethod) == null) {
      synchronized (SMSServiceGrpc.class) {
        if ((getPullReportMergeMethod = SMSServiceGrpc.getPullReportMergeMethod) == null) {
          SMSServiceGrpc.getPullReportMergeMethod = getPullReportMergeMethod = 
              io.grpc.MethodDescriptor.<SMS.PullReportRequest, SMS.PullReportResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.zt.sms.mixcloud.provider.grpc.proto.SMSService", "pullReportMerge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SMS.PullReportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  SMS.PullReportResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SMSServiceMethodDescriptorSupplier("pullReportMerge"))
                  .build();
          }
        }
     }
     return getPullReportMergeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SMSServiceStub newStub(io.grpc.Channel channel) {
    return new SMSServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SMSServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SMSServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SMSServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SMSServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SMSServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *自定义短信发送
     * </pre>
     */
    public void sendSms(SMS.CustomizeSendSMSRequest request,
                        io.grpc.stub.StreamObserver<SMS.CustomizeSendSMSResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendSmsMethod(), responseObserver);
    }

    /**
     * <pre>
     *回复的抓取接口
     * </pre>
     */
    public void pullReply(SMS.PullReplyRequest request,
                          io.grpc.stub.StreamObserver<SMS.PullReplyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPullReplyMethod(), responseObserver);
    }

    /**
     * <pre>
     *回执的抓取接口(多)
     * </pre>
     */
    public void pullReport(SMS.PullReportRequest request,
                           io.grpc.stub.StreamObserver<SMS.PullReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPullReportMethod(), responseObserver);
    }

    /**
     * <pre>
     *回执的抓取接口(单)
     * </pre>
     */
    public void pullReportMerge(SMS.PullReportRequest request,
                                io.grpc.stub.StreamObserver<SMS.PullReportResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPullReportMergeMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendSmsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SMS.CustomizeSendSMSRequest,
                SMS.CustomizeSendSMSResponse>(
                  this, METHODID_SEND_SMS)))
          .addMethod(
            getPullReplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SMS.PullReplyRequest,
                SMS.PullReplyResponse>(
                  this, METHODID_PULL_REPLY)))
          .addMethod(
            getPullReportMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SMS.PullReportRequest,
                SMS.PullReportResponse>(
                  this, METHODID_PULL_REPORT)))
          .addMethod(
            getPullReportMergeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                SMS.PullReportRequest,
                SMS.PullReportResponse>(
                  this, METHODID_PULL_REPORT_MERGE)))
          .build();
    }
  }

  /**
   */
  public static final class SMSServiceStub extends io.grpc.stub.AbstractStub<SMSServiceStub> {
    private SMSServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SMSServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SMSServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SMSServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *自定义短信发送
     * </pre>
     */
    public void sendSms(SMS.CustomizeSendSMSRequest request,
                        io.grpc.stub.StreamObserver<SMS.CustomizeSendSMSResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendSmsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *回复的抓取接口
     * </pre>
     */
    public void pullReply(SMS.PullReplyRequest request,
                          io.grpc.stub.StreamObserver<SMS.PullReplyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPullReplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *回执的抓取接口(多)
     * </pre>
     */
    public void pullReport(SMS.PullReportRequest request,
                           io.grpc.stub.StreamObserver<SMS.PullReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPullReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *回执的抓取接口(单)
     * </pre>
     */
    public void pullReportMerge(SMS.PullReportRequest request,
                                io.grpc.stub.StreamObserver<SMS.PullReportResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPullReportMergeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SMSServiceBlockingStub extends io.grpc.stub.AbstractStub<SMSServiceBlockingStub> {
    private SMSServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SMSServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SMSServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SMSServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *自定义短信发送
     * </pre>
     */
    public SMS.CustomizeSendSMSResponse sendSms(SMS.CustomizeSendSMSRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendSmsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *回复的抓取接口
     * </pre>
     */
    public SMS.PullReplyResponse pullReply(SMS.PullReplyRequest request) {
      return blockingUnaryCall(
          getChannel(), getPullReplyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *回执的抓取接口(多)
     * </pre>
     */
    public SMS.PullReportResponse pullReport(SMS.PullReportRequest request) {
      return blockingUnaryCall(
          getChannel(), getPullReportMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *回执的抓取接口(单)
     * </pre>
     */
    public SMS.PullReportResponse pullReportMerge(SMS.PullReportRequest request) {
      return blockingUnaryCall(
          getChannel(), getPullReportMergeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SMSServiceFutureStub extends io.grpc.stub.AbstractStub<SMSServiceFutureStub> {
    private SMSServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SMSServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected SMSServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SMSServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *自定义短信发送
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SMS.CustomizeSendSMSResponse> sendSms(
        SMS.CustomizeSendSMSRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendSmsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *回复的抓取接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SMS.PullReplyResponse> pullReply(
        SMS.PullReplyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPullReplyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *回执的抓取接口(多)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SMS.PullReportResponse> pullReport(
        SMS.PullReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPullReportMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *回执的抓取接口(单)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<SMS.PullReportResponse> pullReportMerge(
        SMS.PullReportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPullReportMergeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_SMS = 0;
  private static final int METHODID_PULL_REPLY = 1;
  private static final int METHODID_PULL_REPORT = 2;
  private static final int METHODID_PULL_REPORT_MERGE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SMSServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SMSServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_SMS:
          serviceImpl.sendSms((SMS.CustomizeSendSMSRequest) request,
              (io.grpc.stub.StreamObserver<SMS.CustomizeSendSMSResponse>) responseObserver);
          break;
        case METHODID_PULL_REPLY:
          serviceImpl.pullReply((SMS.PullReplyRequest) request,
              (io.grpc.stub.StreamObserver<SMS.PullReplyResponse>) responseObserver);
          break;
        case METHODID_PULL_REPORT:
          serviceImpl.pullReport((SMS.PullReportRequest) request,
              (io.grpc.stub.StreamObserver<SMS.PullReportResponse>) responseObserver);
          break;
        case METHODID_PULL_REPORT_MERGE:
          serviceImpl.pullReportMerge((SMS.PullReportRequest) request,
              (io.grpc.stub.StreamObserver<SMS.PullReportResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SMSServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SMSServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return SMS.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SMSService");
    }
  }

  private static final class SMSServiceFileDescriptorSupplier
      extends SMSServiceBaseDescriptorSupplier {
    SMSServiceFileDescriptorSupplier() {}
  }

  private static final class SMSServiceMethodDescriptorSupplier
      extends SMSServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SMSServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SMSServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SMSServiceFileDescriptorSupplier())
              .addMethod(getSendSmsMethod())
              .addMethod(getPullReplyMethod())
              .addMethod(getPullReportMethod())
              .addMethod(getPullReportMergeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
