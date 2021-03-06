package com.netflix.priam;

import com.amazonaws.auth.AWSCredentialsProvider;

/**
 * Credential file interface for services supporting
 * Access ID and key authentication
 */
public interface ICredential {
    /**
     * Returns AWS credentials instance.  The credentials may change, so call
     * this method each time they're used.
     */
    public AWSCredentialsProvider getCredentials();
}
