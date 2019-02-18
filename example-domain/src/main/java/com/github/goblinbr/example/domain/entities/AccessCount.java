package com.github.goblinbr.example.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "ACCESS_COUNT")
public class AccessCount {

    @Id
    @Column(name = "PAGE")
    private String page;

    @Column(name = "QTY")
    private Long qty;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccessCount)) return false;
        AccessCount that = (AccessCount) o;
        return Objects.equals(page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page);
    }
}
