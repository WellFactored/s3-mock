package com.wellfactored.s3mock

import java.io.{File, InputStream}
import java.net.URL
import java.util
import java.util.Date

import com.amazonaws.services.s3.model._
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration
import com.amazonaws.services.s3.waiters.AmazonS3Waiters
import com.amazonaws.services.s3.{AmazonS3, S3ClientOptions, S3ResponseMetadata}
import com.amazonaws.{AmazonWebServiceRequest, HttpMethod}

class AmazonS3Mock extends AmazonS3 {
  override def setEndpoint(endpoint:                                   String): Unit = ???
  override def setRegion(region:                                       com.amazonaws.regions.Region): Unit = ???
  override def setS3ClientOptions(clientOptions:                       S3ClientOptions): Unit = ???
  override def changeObjectStorageClass(bucketName:                    String, key: String, newStorageClass: StorageClass): Unit = ???
  override def setObjectRedirectLocation(bucketName:                   String, key: String, newRedirectLocation: String): Unit = ???
  override def listObjects(bucketName:                                 String): ObjectListing = ???
  override def listObjects(bucketName:                                 String, prefix: String): ObjectListing = ???
  override def listObjects(listObjectsRequest:                         ListObjectsRequest): ObjectListing = ???
  override def listObjectsV2(bucketName:                               String): ListObjectsV2Result = ???
  override def listObjectsV2(bucketName:                               String, prefix: String): ListObjectsV2Result = ???
  override def listObjectsV2(listObjectsV2Request:                     ListObjectsV2Request): ListObjectsV2Result = ???
  override def listNextBatchOfObjects(previousObjectListing:           ObjectListing): ObjectListing = ???
  override def listNextBatchOfObjects(listNextBatchOfObjectsRequest:   ListNextBatchOfObjectsRequest): ObjectListing = ???
  override def listVersions(bucketName:                                String, prefix: String): VersionListing = ???
  override def listNextBatchOfVersions(previousVersionListing:         VersionListing): VersionListing = ???
  override def listNextBatchOfVersions(listNextBatchOfVersionsRequest: ListNextBatchOfVersionsRequest): VersionListing = ???
  override def listVersions(
    bucketName:                                  String,
    prefix:                                      String,
    keyMarker:                                   String,
    versionIdMarker:                             String,
    delimiter:                                   String,
    maxResults:                                  Integer): VersionListing = ???
  override def listVersions(listVersionsRequest: ListVersionsRequest): VersionListing = ???
  override def getS3AccountOwner: Owner = ???
  override def getS3AccountOwner(getS3AccountOwnerRequest: GetS3AccountOwnerRequest): Owner            = ???
  override def doesBucketExist(bucketName:                 String):                   Boolean          = ???
  override def doesBucketExistV2(bucketName:               String):                   Boolean          = ???
  override def headBucket(headBucketRequest:               HeadBucketRequest):        HeadBucketResult = ???
  override def listBuckets(): util.List[Bucket] = ???
  override def listBuckets(listBucketsRequest:                                     ListBucketsRequest): util.List[Bucket] = ???
  override def getBucketLocation(bucketName:                                       String): String = ???
  override def getBucketLocation(getBucketLocationRequest:                         GetBucketLocationRequest): String = ???
  override def createBucket(createBucketRequest:                                   CreateBucketRequest): Bucket = ???
  override def createBucket(bucketName:                                            String): Bucket = ???
  override def createBucket(bucketName:                                            String, region: Region): Bucket = ???
  override def createBucket(bucketName:                                            String, region: String): Bucket = ???
  override def getObjectAcl(bucketName:                                            String, key: String): AccessControlList = ???
  override def getObjectAcl(bucketName:                                            String, key: String, versionId: String): AccessControlList = ???
  override def getObjectAcl(getObjectAclRequest:                                   GetObjectAclRequest): AccessControlList = ???
  override def setObjectAcl(bucketName:                                            String, key: String, acl: AccessControlList): Unit = ???
  override def setObjectAcl(bucketName:                                            String, key: String, acl: CannedAccessControlList): Unit = ???
  override def setObjectAcl(bucketName:                                            String, key: String, versionId: String, acl: AccessControlList): Unit = ???
  override def setObjectAcl(bucketName:                                            String, key: String, versionId: String, acl: CannedAccessControlList): Unit = ???
  override def setObjectAcl(setObjectAclRequest:                                   SetObjectAclRequest): Unit = ???
  override def getBucketAcl(bucketName:                                            String): AccessControlList = ???
  override def setBucketAcl(setBucketAclRequest:                                   SetBucketAclRequest): Unit = ???
  override def getBucketAcl(getBucketAclRequest:                                   GetBucketAclRequest): AccessControlList = ???
  override def setBucketAcl(bucketName:                                            String, acl: AccessControlList): Unit = ???
  override def setBucketAcl(bucketName:                                            String, acl: CannedAccessControlList): Unit = ???
  override def getObjectMetadata(bucketName:                                       String, key: String): ObjectMetadata = ???
  override def getObjectMetadata(getObjectMetadataRequest:                         GetObjectMetadataRequest): ObjectMetadata = ???
  override def getObject(bucketName:                                               String, key: String): S3Object = ???
  override def getObject(getObjectRequest:                                         GetObjectRequest): S3Object = ???
  override def getObject(getObjectRequest:                                         GetObjectRequest, destinationFile: File): ObjectMetadata = ???
  override def getObjectAsString(bucketName:                                       String, key: String): String = ???
  override def getObjectTagging(getObjectTaggingRequest:                           GetObjectTaggingRequest): GetObjectTaggingResult = ???
  override def setObjectTagging(setObjectTaggingRequest:                           SetObjectTaggingRequest): SetObjectTaggingResult = ???
  override def deleteObjectTagging(deleteObjectTaggingRequest:                     DeleteObjectTaggingRequest): DeleteObjectTaggingResult = ???
  override def deleteBucket(deleteBucketRequest:                                   DeleteBucketRequest): Unit = ???
  override def deleteBucket(bucketName:                                            String): Unit = ???
  override def putObject(putObjectRequest:                                         PutObjectRequest): PutObjectResult = ???
  override def putObject(bucketName:                                               String, key: String, file: File): PutObjectResult = ???
  override def putObject(bucketName:                                               String, key: String, input: InputStream, metadata: ObjectMetadata): PutObjectResult = ???
  override def putObject(bucketName:                                               String, key: String, content: String): PutObjectResult = ???
  override def copyObject(sourceBucketName:                                        String, sourceKey: String, destinationBucketName: String, destinationKey: String): CopyObjectResult = ???
  override def copyObject(copyObjectRequest:                                       CopyObjectRequest): CopyObjectResult = ???
  override def copyPart(copyPartRequest:                                           CopyPartRequest): CopyPartResult = ???
  override def deleteObject(bucketName:                                            String, key: String): Unit = ???
  override def deleteObject(deleteObjectRequest:                                   DeleteObjectRequest): Unit = ???
  override def deleteObjects(deleteObjectsRequest:                                 DeleteObjectsRequest): DeleteObjectsResult = ???
  override def deleteVersion(bucketName:                                           String, key: String, versionId: String): Unit = ???
  override def deleteVersion(deleteVersionRequest:                                 DeleteVersionRequest): Unit = ???
  override def getBucketLoggingConfiguration(bucketName:                           String): BucketLoggingConfiguration = ???
  override def getBucketLoggingConfiguration(getBucketLoggingConfigurationRequest: GetBucketLoggingConfigurationRequest): BucketLoggingConfiguration =
    ???
  override def setBucketLoggingConfiguration(setBucketLoggingConfigurationRequest: SetBucketLoggingConfigurationRequest): Unit                          = ???
  override def getBucketVersioningConfiguration(bucketName:                        String):                               BucketVersioningConfiguration = ???
  override def getBucketVersioningConfiguration(
    getBucketVersioningConfigurationRequest:                                             GetBucketVersioningConfigurationRequest): BucketVersioningConfiguration = ???
  override def setBucketVersioningConfiguration(setBucketVersioningConfigurationRequest: SetBucketVersioningConfigurationRequest): Unit                          = ???
  override def getBucketLifecycleConfiguration(bucketName:                               String):                                  BucketLifecycleConfiguration  = ???
  override def getBucketLifecycleConfiguration(
    getBucketLifecycleConfigurationRequest:                                                  GetBucketLifecycleConfigurationRequest): BucketLifecycleConfiguration = ???
  override def setBucketLifecycleConfiguration(bucketName:                                   String, bucketLifecycleConfiguration: BucketLifecycleConfiguration): Unit = ???
  override def setBucketLifecycleConfiguration(setBucketLifecycleConfigurationRequest:       SetBucketLifecycleConfigurationRequest): Unit = ???
  override def deleteBucketLifecycleConfiguration(bucketName:                                String): Unit = ???
  override def deleteBucketLifecycleConfiguration(deleteBucketLifecycleConfigurationRequest: DeleteBucketLifecycleConfigurationRequest): Unit = ???
  override def getBucketCrossOriginConfiguration(bucketName:                                 String): BucketCrossOriginConfiguration = ???
  override def getBucketCrossOriginConfiguration(
    getBucketCrossOriginConfigurationRequest:                                                    GetBucketCrossOriginConfigurationRequest): BucketCrossOriginConfiguration = ???
  override def setBucketCrossOriginConfiguration(bucketName:                                     String, bucketCrossOriginConfiguration: BucketCrossOriginConfiguration): Unit = ???
  override def setBucketCrossOriginConfiguration(setBucketCrossOriginConfigurationRequest:       SetBucketCrossOriginConfigurationRequest): Unit = ???
  override def deleteBucketCrossOriginConfiguration(bucketName:                                  String): Unit = ???
  override def deleteBucketCrossOriginConfiguration(deleteBucketCrossOriginConfigurationRequest: DeleteBucketCrossOriginConfigurationRequest): Unit =
    ???
  override def getBucketTaggingConfiguration(bucketName:                           String): BucketTaggingConfiguration = ???
  override def getBucketTaggingConfiguration(getBucketTaggingConfigurationRequest: GetBucketTaggingConfigurationRequest): BucketTaggingConfiguration =
    ???
  override def setBucketTaggingConfiguration(bucketName:                                 String, bucketTaggingConfiguration: BucketTaggingConfiguration): Unit = ???
  override def setBucketTaggingConfiguration(setBucketTaggingConfigurationRequest:       SetBucketTaggingConfigurationRequest): Unit = ???
  override def deleteBucketTaggingConfiguration(bucketName:                              String): Unit = ???
  override def deleteBucketTaggingConfiguration(deleteBucketTaggingConfigurationRequest: DeleteBucketTaggingConfigurationRequest): Unit = ???
  override def getBucketNotificationConfiguration(bucketName:                            String): BucketNotificationConfiguration = ???
  override def getBucketNotificationConfiguration(
    getBucketNotificationConfigurationRequest:                                               GetBucketNotificationConfigurationRequest): BucketNotificationConfiguration = ???
  override def setBucketNotificationConfiguration(setBucketNotificationConfigurationRequest: SetBucketNotificationConfigurationRequest): Unit = ???
  override def setBucketNotificationConfiguration(bucketName:                                String, bucketNotificationConfiguration: BucketNotificationConfiguration): Unit = ???
  override def getBucketWebsiteConfiguration(bucketName:                                     String): BucketWebsiteConfiguration = ???
  override def getBucketWebsiteConfiguration(getBucketWebsiteConfigurationRequest:           GetBucketWebsiteConfigurationRequest): BucketWebsiteConfiguration =
    ???
  override def setBucketWebsiteConfiguration(bucketName:                                   String, configuration: BucketWebsiteConfiguration): Unit = ???
  override def setBucketWebsiteConfiguration(setBucketWebsiteConfigurationRequest:         SetBucketWebsiteConfigurationRequest): Unit = ???
  override def deleteBucketWebsiteConfiguration(bucketName:                                String): Unit = ???
  override def deleteBucketWebsiteConfiguration(deleteBucketWebsiteConfigurationRequest:   DeleteBucketWebsiteConfigurationRequest): Unit = ???
  override def getBucketPolicy(bucketName:                                                 String): BucketPolicy = ???
  override def getBucketPolicy(getBucketPolicyRequest:                                     GetBucketPolicyRequest): BucketPolicy = ???
  override def setBucketPolicy(bucketName:                                                 String, policyText: String): Unit = ???
  override def setBucketPolicy(setBucketPolicyRequest:                                     SetBucketPolicyRequest): Unit = ???
  override def deleteBucketPolicy(bucketName:                                              String): Unit = ???
  override def deleteBucketPolicy(deleteBucketPolicyRequest:                               DeleteBucketPolicyRequest): Unit = ???
  override def generatePresignedUrl(bucketName:                                            String, key: String, expiration: Date): URL = ???
  override def generatePresignedUrl(bucketName:                                            String, key: String, expiration: Date, method: HttpMethod): URL = ???
  override def generatePresignedUrl(generatePresignedUrlRequest:                           GeneratePresignedUrlRequest): URL = ???
  override def initiateMultipartUpload(request:                                            InitiateMultipartUploadRequest): InitiateMultipartUploadResult = ???
  override def uploadPart(request:                                                         UploadPartRequest): UploadPartResult = ???
  override def listParts(request:                                                          ListPartsRequest): PartListing = ???
  override def abortMultipartUpload(request:                                               AbortMultipartUploadRequest): Unit = ???
  override def completeMultipartUpload(request:                                            CompleteMultipartUploadRequest): CompleteMultipartUploadResult = ???
  override def listMultipartUploads(request:                                               ListMultipartUploadsRequest): MultipartUploadListing = ???
  override def getCachedResponseMetadata(request:                                          AmazonWebServiceRequest): S3ResponseMetadata = ???
  override def restoreObject(request:                                                      RestoreObjectRequest): Unit = ???
  override def restoreObjectV2(request:                                                    RestoreObjectRequest): RestoreObjectResult = ???
  override def restoreObject(bucketName:                                                   String, key: String, expirationInDays: Int): Unit = ???
  override def enableRequesterPays(bucketName:                                             String): Unit = ???
  override def disableRequesterPays(bucketName:                                            String): Unit = ???
  override def isRequesterPaysEnabled(bucketName:                                          String): Boolean = ???
  override def setBucketReplicationConfiguration(bucketName:                               String, configuration: BucketReplicationConfiguration): Unit = ???
  override def setBucketReplicationConfiguration(setBucketReplicationConfigurationRequest: SetBucketReplicationConfigurationRequest): Unit = ???
  override def getBucketReplicationConfiguration(bucketName:                               String): BucketReplicationConfiguration = ???
  override def getBucketReplicationConfiguration(
    getBucketReplicationConfigurationRequest:                   GetBucketReplicationConfigurationRequest): BucketReplicationConfiguration = ???
  override def deleteBucketReplicationConfiguration(bucketName: String): Unit = ???
  override def deleteBucketReplicationConfiguration(request:    DeleteBucketReplicationConfigurationRequest): Unit = ???
  override def doesObjectExist(bucketName:                      String, objectName: String): Boolean = ???
  override def getBucketAccelerateConfiguration(bucketName:     String): BucketAccelerateConfiguration = ???
  override def getBucketAccelerateConfiguration(
    getBucketAccelerateConfigurationRequest:                                             GetBucketAccelerateConfigurationRequest): BucketAccelerateConfiguration = ???
  override def setBucketAccelerateConfiguration(bucketName:                              String, accelerateConfiguration: BucketAccelerateConfiguration): Unit = ???
  override def setBucketAccelerateConfiguration(setBucketAccelerateConfigurationRequest: SetBucketAccelerateConfigurationRequest): Unit = ???
  override def deleteBucketMetricsConfiguration(bucketName:                              String, id: String): DeleteBucketMetricsConfigurationResult = ???
  override def deleteBucketMetricsConfiguration(
    deleteBucketMetricsConfigurationRequest:             DeleteBucketMetricsConfigurationRequest): DeleteBucketMetricsConfigurationResult = ???
  override def getBucketMetricsConfiguration(bucketName: String, id: String): GetBucketMetricsConfigurationResult = ???
  override def getBucketMetricsConfiguration(
    getBucketMetricsConfigurationRequest:                GetBucketMetricsConfigurationRequest): GetBucketMetricsConfigurationResult = ???
  override def setBucketMetricsConfiguration(bucketName: String, metricsConfiguration: MetricsConfiguration): SetBucketMetricsConfigurationResult =
    ???
  override def setBucketMetricsConfiguration(
    setBucketMetricsConfigurationRequest: SetBucketMetricsConfigurationRequest): SetBucketMetricsConfigurationResult = ???
  override def listBucketMetricsConfigurations(
    listBucketMetricsConfigurationsRequest:                   ListBucketMetricsConfigurationsRequest): ListBucketMetricsConfigurationsResult = ???
  override def deleteBucketAnalyticsConfiguration(bucketName: String, id: String): DeleteBucketAnalyticsConfigurationResult = ???
  override def deleteBucketAnalyticsConfiguration(
    deleteBucketAnalyticsConfigurationRequest:             DeleteBucketAnalyticsConfigurationRequest): DeleteBucketAnalyticsConfigurationResult = ???
  override def getBucketAnalyticsConfiguration(bucketName: String, id: String): GetBucketAnalyticsConfigurationResult = ???
  override def getBucketAnalyticsConfiguration(
    getBucketAnalyticsConfigurationRequest: GetBucketAnalyticsConfigurationRequest): GetBucketAnalyticsConfigurationResult = ???
  override def setBucketAnalyticsConfiguration(
    bucketName:             String,
    analyticsConfiguration: AnalyticsConfiguration): SetBucketAnalyticsConfigurationResult = ???
  override def setBucketAnalyticsConfiguration(
    setBucketAnalyticsConfigurationRequest: SetBucketAnalyticsConfigurationRequest): SetBucketAnalyticsConfigurationResult = ???
  override def listBucketAnalyticsConfigurations(
    listBucketAnalyticsConfigurationsRequest:                 ListBucketAnalyticsConfigurationsRequest): ListBucketAnalyticsConfigurationsResult = ???
  override def deleteBucketInventoryConfiguration(bucketName: String, id: String): DeleteBucketInventoryConfigurationResult = ???
  override def deleteBucketInventoryConfiguration(
    deleteBucketInventoryConfigurationRequest:             DeleteBucketInventoryConfigurationRequest): DeleteBucketInventoryConfigurationResult = ???
  override def getBucketInventoryConfiguration(bucketName: String, id: String): GetBucketInventoryConfigurationResult = ???
  override def getBucketInventoryConfiguration(
    getBucketInventoryConfigurationRequest: GetBucketInventoryConfigurationRequest): GetBucketInventoryConfigurationResult = ???
  override def setBucketInventoryConfiguration(
    bucketName:             String,
    inventoryConfiguration: InventoryConfiguration): SetBucketInventoryConfigurationResult = ???
  override def setBucketInventoryConfiguration(
    setBucketInventoryConfigurationRequest: SetBucketInventoryConfigurationRequest): SetBucketInventoryConfigurationResult = ???
  override def listBucketInventoryConfigurations(
    listBucketInventoryConfigurationsRequest:                                ListBucketInventoryConfigurationsRequest): ListBucketInventoryConfigurationsResult = ???
  override def deleteBucketEncryption(bucketName:                            String): DeleteBucketEncryptionResult = ???
  override def deleteBucketEncryption(request:                               DeleteBucketEncryptionRequest): DeleteBucketEncryptionResult = ???
  override def getBucketEncryption(bucketName:                               String): GetBucketEncryptionResult = ???
  override def getBucketEncryption(request:                                  GetBucketEncryptionRequest): GetBucketEncryptionResult = ???
  override def setBucketEncryption(setBucketEncryptionRequest:               SetBucketEncryptionRequest): SetBucketEncryptionResult = ???
  override def setPublicAccessBlock(request:                                 SetPublicAccessBlockRequest): SetPublicAccessBlockResult = ???
  override def getPublicAccessBlock(request:                                 GetPublicAccessBlockRequest): GetPublicAccessBlockResult = ???
  override def deletePublicAccessBlock(request:                              DeletePublicAccessBlockRequest): DeletePublicAccessBlockResult = ???
  override def getBucketPolicyStatus(request:                                GetBucketPolicyStatusRequest): GetBucketPolicyStatusResult = ???
  override def selectObjectContent(selectRequest:                            SelectObjectContentRequest): SelectObjectContentResult = ???
  override def setObjectLegalHold(setObjectLegalHoldRequest:                 SetObjectLegalHoldRequest): SetObjectLegalHoldResult = ???
  override def getObjectLegalHold(getObjectLegalHoldRequest:                 GetObjectLegalHoldRequest): GetObjectLegalHoldResult = ???
  override def setObjectLockConfiguration(setObjectLockConfigurationRequest: SetObjectLockConfigurationRequest): SetObjectLockConfigurationResult =
    ???
  override def getObjectLockConfiguration(getObjectLockConfigurationRequest: GetObjectLockConfigurationRequest): GetObjectLockConfigurationResult =
    ???
  override def setObjectRetention(setObjectRetentionRequest: SetObjectRetentionRequest): SetObjectRetentionResult = ???
  override def getObjectRetention(getObjectRetentionRequest: GetObjectRetentionRequest): GetObjectRetentionResult = ???
  override def download(presignedUrlDownloadRequest:         PresignedUrlDownloadRequest): PresignedUrlDownloadResult = ???
  override def download(presignedUrlDownloadRequest:         PresignedUrlDownloadRequest, destinationFile: File): Unit = ???
  override def upload(presignedUrlUploadRequest:             PresignedUrlUploadRequest): PresignedUrlUploadResult = ???
  override def shutdown():    Unit   = ???
  override def getRegion:     Region = ???
  override def getRegionName: String = ???
  override def getUrl(bucketName: String, key: String): URL = ???
  override def waiters(): AmazonS3Waiters = ???
}
