/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-10-17 16:43:55 UTC)
 * on 2016-12-22 at 22:22:29 UTC 
 * Modify at your own risk.
 */

package com.mycompany.services.scoreentityendpoint;

/**
 * Service definition for Scoreentityendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ScoreentityendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Scoreentityendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the scoreentityendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://movizquiz.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "scoreentityendpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Scoreentityendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Scoreentityendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getScoreEntity".
   *
   * This request holds the parameters needed by the scoreentityendpoint server.  After setting any
   * optional parameters, call the {@link GetScoreEntity#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public GetScoreEntity getScoreEntity(java.lang.String id) throws java.io.IOException {
    GetScoreEntity result = new GetScoreEntity(id);
    initialize(result);
    return result;
  }

  public class GetScoreEntity extends ScoreentityendpointRequest<com.mycompany.services.scoreentityendpoint.model.ScoreEntity> {

    private static final String REST_PATH = "scoreentity/{id}";

    /**
     * Create a request for the method "getScoreEntity".
     *
     * This request holds the parameters needed by the the scoreentityendpoint server.  After setting
     * any optional parameters, call the {@link GetScoreEntity#execute()} method to invoke the remote
     * operation. <p> {@link GetScoreEntity#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetScoreEntity(java.lang.String id) {
      super(Scoreentityendpoint.this, "GET", REST_PATH, null, com.mycompany.services.scoreentityendpoint.model.ScoreEntity.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetScoreEntity setAlt(java.lang.String alt) {
      return (GetScoreEntity) super.setAlt(alt);
    }

    @Override
    public GetScoreEntity setFields(java.lang.String fields) {
      return (GetScoreEntity) super.setFields(fields);
    }

    @Override
    public GetScoreEntity setKey(java.lang.String key) {
      return (GetScoreEntity) super.setKey(key);
    }

    @Override
    public GetScoreEntity setOauthToken(java.lang.String oauthToken) {
      return (GetScoreEntity) super.setOauthToken(oauthToken);
    }

    @Override
    public GetScoreEntity setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetScoreEntity) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetScoreEntity setQuotaUser(java.lang.String quotaUser) {
      return (GetScoreEntity) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetScoreEntity setUserIp(java.lang.String userIp) {
      return (GetScoreEntity) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public GetScoreEntity setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public GetScoreEntity set(String parameterName, Object value) {
      return (GetScoreEntity) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertScoreEntity".
   *
   * This request holds the parameters needed by the scoreentityendpoint server.  After setting any
   * optional parameters, call the {@link InsertScoreEntity#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.mycompany.services.scoreentityendpoint.model.ScoreEntity}
   * @return the request
   */
  public InsertScoreEntity insertScoreEntity(com.mycompany.services.scoreentityendpoint.model.ScoreEntity content) throws java.io.IOException {
    InsertScoreEntity result = new InsertScoreEntity(content);
    initialize(result);
    return result;
  }

  public class InsertScoreEntity extends ScoreentityendpointRequest<com.mycompany.services.scoreentityendpoint.model.ScoreEntity> {

    private static final String REST_PATH = "scoreentity";

    /**
     * Create a request for the method "insertScoreEntity".
     *
     * This request holds the parameters needed by the the scoreentityendpoint server.  After setting
     * any optional parameters, call the {@link InsertScoreEntity#execute()} method to invoke the
     * remote operation. <p> {@link InsertScoreEntity#initialize(com.google.api.client.googleapis.serv
     * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.mycompany.services.scoreentityendpoint.model.ScoreEntity}
     * @since 1.13
     */
    protected InsertScoreEntity(com.mycompany.services.scoreentityendpoint.model.ScoreEntity content) {
      super(Scoreentityendpoint.this, "POST", REST_PATH, content, com.mycompany.services.scoreentityendpoint.model.ScoreEntity.class);
    }

    @Override
    public InsertScoreEntity setAlt(java.lang.String alt) {
      return (InsertScoreEntity) super.setAlt(alt);
    }

    @Override
    public InsertScoreEntity setFields(java.lang.String fields) {
      return (InsertScoreEntity) super.setFields(fields);
    }

    @Override
    public InsertScoreEntity setKey(java.lang.String key) {
      return (InsertScoreEntity) super.setKey(key);
    }

    @Override
    public InsertScoreEntity setOauthToken(java.lang.String oauthToken) {
      return (InsertScoreEntity) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertScoreEntity setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertScoreEntity) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertScoreEntity setQuotaUser(java.lang.String quotaUser) {
      return (InsertScoreEntity) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertScoreEntity setUserIp(java.lang.String userIp) {
      return (InsertScoreEntity) super.setUserIp(userIp);
    }

    @Override
    public InsertScoreEntity set(String parameterName, Object value) {
      return (InsertScoreEntity) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listScoreEntity".
   *
   * This request holds the parameters needed by the scoreentityendpoint server.  After setting any
   * optional parameters, call the {@link ListScoreEntity#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListScoreEntity listScoreEntity() throws java.io.IOException {
    ListScoreEntity result = new ListScoreEntity();
    initialize(result);
    return result;
  }

  public class ListScoreEntity extends ScoreentityendpointRequest<com.mycompany.services.scoreentityendpoint.model.CollectionResponseScoreEntity> {

    private static final String REST_PATH = "scoreentity";

    /**
     * Create a request for the method "listScoreEntity".
     *
     * This request holds the parameters needed by the the scoreentityendpoint server.  After setting
     * any optional parameters, call the {@link ListScoreEntity#execute()} method to invoke the remote
     * operation. <p> {@link ListScoreEntity#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListScoreEntity() {
      super(Scoreentityendpoint.this, "GET", REST_PATH, null, com.mycompany.services.scoreentityendpoint.model.CollectionResponseScoreEntity.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListScoreEntity setAlt(java.lang.String alt) {
      return (ListScoreEntity) super.setAlt(alt);
    }

    @Override
    public ListScoreEntity setFields(java.lang.String fields) {
      return (ListScoreEntity) super.setFields(fields);
    }

    @Override
    public ListScoreEntity setKey(java.lang.String key) {
      return (ListScoreEntity) super.setKey(key);
    }

    @Override
    public ListScoreEntity setOauthToken(java.lang.String oauthToken) {
      return (ListScoreEntity) super.setOauthToken(oauthToken);
    }

    @Override
    public ListScoreEntity setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListScoreEntity) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListScoreEntity setQuotaUser(java.lang.String quotaUser) {
      return (ListScoreEntity) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListScoreEntity setUserIp(java.lang.String userIp) {
      return (ListScoreEntity) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListScoreEntity setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListScoreEntity setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListScoreEntity set(String parameterName, Object value) {
      return (ListScoreEntity) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeScoreEntity".
   *
   * This request holds the parameters needed by the scoreentityendpoint server.  After setting any
   * optional parameters, call the {@link RemoveScoreEntity#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveScoreEntity removeScoreEntity(java.lang.String id) throws java.io.IOException {
    RemoveScoreEntity result = new RemoveScoreEntity(id);
    initialize(result);
    return result;
  }

  public class RemoveScoreEntity extends ScoreentityendpointRequest<Void> {

    private static final String REST_PATH = "scoreentity/{id}";

    /**
     * Create a request for the method "removeScoreEntity".
     *
     * This request holds the parameters needed by the the scoreentityendpoint server.  After setting
     * any optional parameters, call the {@link RemoveScoreEntity#execute()} method to invoke the
     * remote operation. <p> {@link RemoveScoreEntity#initialize(com.google.api.client.googleapis.serv
     * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveScoreEntity(java.lang.String id) {
      super(Scoreentityendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveScoreEntity setAlt(java.lang.String alt) {
      return (RemoveScoreEntity) super.setAlt(alt);
    }

    @Override
    public RemoveScoreEntity setFields(java.lang.String fields) {
      return (RemoveScoreEntity) super.setFields(fields);
    }

    @Override
    public RemoveScoreEntity setKey(java.lang.String key) {
      return (RemoveScoreEntity) super.setKey(key);
    }

    @Override
    public RemoveScoreEntity setOauthToken(java.lang.String oauthToken) {
      return (RemoveScoreEntity) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveScoreEntity setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveScoreEntity) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveScoreEntity setQuotaUser(java.lang.String quotaUser) {
      return (RemoveScoreEntity) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveScoreEntity setUserIp(java.lang.String userIp) {
      return (RemoveScoreEntity) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String id;

    /**

     */
    public java.lang.String getId() {
      return id;
    }

    public RemoveScoreEntity setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveScoreEntity set(String parameterName, Object value) {
      return (RemoveScoreEntity) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateScoreEntity".
   *
   * This request holds the parameters needed by the scoreentityendpoint server.  After setting any
   * optional parameters, call the {@link UpdateScoreEntity#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.mycompany.services.scoreentityendpoint.model.ScoreEntity}
   * @return the request
   */
  public UpdateScoreEntity updateScoreEntity(com.mycompany.services.scoreentityendpoint.model.ScoreEntity content) throws java.io.IOException {
    UpdateScoreEntity result = new UpdateScoreEntity(content);
    initialize(result);
    return result;
  }

  public class UpdateScoreEntity extends ScoreentityendpointRequest<com.mycompany.services.scoreentityendpoint.model.ScoreEntity> {

    private static final String REST_PATH = "scoreentity";

    /**
     * Create a request for the method "updateScoreEntity".
     *
     * This request holds the parameters needed by the the scoreentityendpoint server.  After setting
     * any optional parameters, call the {@link UpdateScoreEntity#execute()} method to invoke the
     * remote operation. <p> {@link UpdateScoreEntity#initialize(com.google.api.client.googleapis.serv
     * ices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.mycompany.services.scoreentityendpoint.model.ScoreEntity}
     * @since 1.13
     */
    protected UpdateScoreEntity(com.mycompany.services.scoreentityendpoint.model.ScoreEntity content) {
      super(Scoreentityendpoint.this, "PUT", REST_PATH, content, com.mycompany.services.scoreentityendpoint.model.ScoreEntity.class);
    }

    @Override
    public UpdateScoreEntity setAlt(java.lang.String alt) {
      return (UpdateScoreEntity) super.setAlt(alt);
    }

    @Override
    public UpdateScoreEntity setFields(java.lang.String fields) {
      return (UpdateScoreEntity) super.setFields(fields);
    }

    @Override
    public UpdateScoreEntity setKey(java.lang.String key) {
      return (UpdateScoreEntity) super.setKey(key);
    }

    @Override
    public UpdateScoreEntity setOauthToken(java.lang.String oauthToken) {
      return (UpdateScoreEntity) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateScoreEntity setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateScoreEntity) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateScoreEntity setQuotaUser(java.lang.String quotaUser) {
      return (UpdateScoreEntity) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateScoreEntity setUserIp(java.lang.String userIp) {
      return (UpdateScoreEntity) super.setUserIp(userIp);
    }

    @Override
    public UpdateScoreEntity set(String parameterName, Object value) {
      return (UpdateScoreEntity) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Scoreentityendpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Scoreentityendpoint}. */
    @Override
    public Scoreentityendpoint build() {
      return new Scoreentityendpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ScoreentityendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setScoreentityendpointRequestInitializer(
        ScoreentityendpointRequestInitializer scoreentityendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(scoreentityendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
