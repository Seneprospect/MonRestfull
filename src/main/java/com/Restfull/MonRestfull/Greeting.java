package com.Restfull.MonRestfull;

import java.util.Objects;

public record
Greeting(long id, String content) {

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Greeting) obj;
        return this.id == that.id &&
                Objects.equals(this.content, that.content);
    }

    @Override
    public String toString() {
        return "Greeting[" +
                "id=" + id + ", " +
                "content=" + content + ']';
    }


}