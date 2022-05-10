package com.leonardo.apiestoque.system;

import java.io.Serializable;

public interface IIdentifier<T extends Number> extends Serializable {
    T getId();
}
