package com.leonardo.apiestoque.system;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class GenericEntity<T extends Number> implements IIdentifier<T>, Serializable {

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.getId() != null ? this.getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        final GenericEntity other = (GenericEntity) obj;
        if (this.getId() != null && other.getId() == null) {
            return false;
        }
        if (this.getId() == null && other.getId() != null) {
            return false;
        }
        if (this.getId() == null && other.getId() == null) {
            return false;
        }
        return this.getId().equals(other.getId());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ("[id= " + getId()+"]");
    }

    public boolean hasId() {
        return this.getId() != null;
    }

}
