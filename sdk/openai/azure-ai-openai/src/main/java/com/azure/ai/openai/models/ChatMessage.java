// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A single, role-attributed message within a chat completion interaction. */
@Fluent
public final class ChatMessage {

    /*
     * The role associated with this message payload.
     */
    @Generated
    @JsonProperty(value = "role")
    private ChatRole role;

    /*
     * The text associated with this message payload.
     */
    @Generated
    @JsonProperty(value = "content")
    private String content;

    /**
     * Get the role property: The role associated with this message payload.
     *
     * @return the role value.
     */
    @Generated
    public ChatRole getRole() {
        return this.role;
    }

    /**
     * Get the content property: The text associated with this message payload.
     *
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /*
     * The name of the author of this message. `name` is required if role is `function`, and it should be the name of
     * the
     * function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length
     * of
     * 64 characters.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The name and arguments of a function that should be called, as generated by the model.
     */
    @Generated
    @JsonProperty(value = "function_call")
    private FunctionCall functionCall;

    /**
     * Get the name property: The name of the author of this message. `name` is required if role is `function`, and it
     * should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and
     * underscores, with a maximum length of 64 characters.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the author of this message. `name` is required if role is `function`, and it
     * should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and
     * underscores, with a maximum length of 64 characters.
     *
     * @param name the name value to set.
     * @return the ChatMessage object itself.
     */
    @Generated
    public ChatMessage setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the functionCall property: The name and arguments of a function that should be called, as generated by the
     * model.
     *
     * @return the functionCall value.
     */
    @Generated
    public FunctionCall getFunctionCall() {
        return this.functionCall;
    }

    /**
     * Set the functionCall property: The name and arguments of a function that should be called, as generated by the
     * model.
     *
     * @param functionCall the functionCall value to set.
     * @return the ChatMessage object itself.
     */
    @Generated
    public ChatMessage setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
        return this;
    }

    /**
     * Creates an instance of ChatMessage class.
     *
     * @param role the role value to set.
     * @param content the content value to set.
     */
    @Generated
    @JsonCreator
    public ChatMessage(@JsonProperty(value = "role") ChatRole role, @JsonProperty(value = "content") String content) {
        this.role = role;
        this.content = content;
    }

    /*
     * Additional context data associated with a chat message when requesting chat completions using compatible Azure
     * OpenAI chat extensions. This includes information like the intermediate data source retrievals used to service a
     * request.
     * This context information is only populated when using Azure OpenAI with chat extensions capabilities configured.
     */
    @Generated
    @JsonProperty(value = "context")
    private AzureChatExtensionsMessageContext context;

    /**
     * Get the context property: Additional context data associated with a chat message when requesting chat completions
     * using compatible Azure OpenAI chat extensions. This includes information like the intermediate data source
     * retrievals used to service a request. This context information is only populated when using Azure OpenAI with
     * chat extensions capabilities configured.
     *
     * @return the context value.
     */
    @Generated
    public AzureChatExtensionsMessageContext getContext() {
        return this.context;
    }

    /**
     * Set the context property: Additional context data associated with a chat message when requesting chat completions
     * using compatible Azure OpenAI chat extensions. This includes information like the intermediate data source
     * retrievals used to service a request. This context information is only populated when using Azure OpenAI with
     * chat extensions capabilities configured.
     *
     * @param context the context value to set.
     * @return the ChatMessage object itself.
     */
    @Generated
    public ChatMessage setContext(AzureChatExtensionsMessageContext context) {
        this.context = context;
        return this;
    }
}
