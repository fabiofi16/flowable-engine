/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flowable.http;

import java.util.Collection;

import org.flowable.http.common.api.HttpHeaders;
import org.flowable.http.common.api.MultiValuePart;

/**
 * @author Harsha Teja Kanna.
 *
 * @deprecated
 */
@Deprecated
public class HttpRequest extends org.flowable.http.common.api.HttpRequest {

    protected final org.flowable.http.common.api.HttpRequest delegate;

    public HttpRequest() {
        this(null);
    }
    
    protected HttpRequest(org.flowable.http.common.api.HttpRequest request) {
        this.delegate = request;
    }

    /**
     * @deprecated use {@link #getHttpHeadersAsString()} instead
     */
    @Deprecated
    public String getHeaders() {
        return getHttpHeadersAsString();
    }

    /**
     * @deprecated use {@link #setHttpHeaders(HttpHeaders)} instead
     */
    @Deprecated
    public void setHeaders(String headers) {
        HttpHeaders parsedHeaders = HttpHeaders.parseFromString(headers);
        if (delegate != null) {
            delegate.setHttpHeaders(parsedHeaders);
        } else {
            super.setHttpHeaders(parsedHeaders);
        }
    }

    @Override
    public String getMethod() {
        return delegate != null ? delegate.getMethod() : super.getMethod();
    }

    @Override
    public void setMethod(String method) {
        if (delegate != null) {
            delegate.setMethod(method);
        } else {
            super.setMethod(method);
        }
    }

    @Override
    public String getUrl() {
        return delegate != null ? delegate.getUrl() : super.getUrl();
    }

    @Override
    public void setUrl(String url) {
        if (delegate != null) {
            delegate.setUrl(url);
        } else {
            super.setUrl(url);
        }
    }

    @Override
    public HttpHeaders getHttpHeaders() {
        return delegate != null ? delegate.getHttpHeaders() : super.getHttpHeaders();
    }

    @Override
    public String getHttpHeadersAsString() {
        return delegate != null ? delegate.getHttpHeadersAsString() : super.getHttpHeadersAsString();
    }

    @Override
    public void setHttpHeaders(HttpHeaders httpHeaders) {
        if (delegate != null) {
            delegate.setHttpHeaders(httpHeaders);
        } else {
            super.setHttpHeaders(httpHeaders);
        }
    }

    @Override
    public String getBody() {
        return delegate != null ? delegate.getBody() : super.getBody();
    }

    @Override
    public void setBody(String body) {
        if (delegate != null) {
            delegate.setBody(body);
        } else {
            super.setBody(body);
        }
    }

    @Override
    public String getBodyEncoding() {
        return delegate != null ? delegate.getBodyEncoding() : super.getBodyEncoding();
    }

    @Override
    public void setBodyEncoding(String bodyEncoding) {
        if (delegate != null) {
            delegate.setBodyEncoding(bodyEncoding);
        } else {
            super.setBodyEncoding(bodyEncoding);
        }
    }

    @Override
    public Collection<MultiValuePart> getMultiValueParts() {
        return delegate != null ? delegate.getMultiValueParts() : super.getMultiValueParts();
    }

    @Override
    public void addMultiValuePart(MultiValuePart part) {
        if (delegate != null) {
            delegate.addMultiValuePart(part);
        } else {
            super.addMultiValuePart(part);
        }
    }

    @Override
    public int getTimeout() {
        return delegate != null ? delegate.getTimeout() : super.getTimeout();
    }

    @Override
    public void setTimeout(int timeout) {
        if (delegate != null) {
            delegate.setTimeout(timeout);
        } else {
            super.setTimeout(timeout);
        }
    }

    @Override
    public boolean isNoRedirects() {
        return delegate != null ? delegate.isNoRedirects() : super.isNoRedirects();
    }

    @Override
    public void setNoRedirects(boolean noRedirects) {
        if (delegate != null) {
            delegate.setNoRedirects(noRedirects);
        } else {
            super.setNoRedirects(noRedirects);
        }
    }

    public static HttpRequest fromApiHttpRequest(org.flowable.http.common.api.HttpRequest request) {
        return new HttpRequest(request);
    }
}
