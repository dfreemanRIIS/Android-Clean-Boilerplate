package com.kodelabs.boilerplate;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void testWelcomeMessageFound() throws Exception {

        String msg = "Welcome, friend!";

        when(mMessageRepository.getWelcomeMessage())
                .thenReturn(msg);

        WelcomingInteractorImpl interactor = new WelcomingInteractorImpl(
                mExecutor,
                mMainThread,
                mMockedCallback,
                mMessageRepository
        );
        interactor.run();

        Mockito.verify(mMessageRepository).getWelcomeMessage();
        Mockito.verifyNoMoreInteractions(mMessageRepository);
        Mockito.verify(mMockedCallback).onMessageRetrieved(msg);
    }
}