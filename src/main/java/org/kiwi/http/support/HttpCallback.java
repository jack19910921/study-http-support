package org.kiwi.http.support;

/**
 * Created by jack on 16/7/31.
 */
public interface HttpCallback<T> {
    T doParseResult(String result);
}
