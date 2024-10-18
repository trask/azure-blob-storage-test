package org.example;

import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.specialized.BlobClientBase;

public class Main {

    public static void main(String[] args) {

        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .endpoint("https://trasktest.blob.core.windows.net/")
                .connectionString(System.getenv("AZURE_BLOB_CONNECTION_STRING"))
                .buildClient();

        BlobClientBase blobClientBase = blobServiceClient.getBlobContainerClient("test").getBlobClient("test");

        blobClientBase.exists();
    }
}
