package ru.otus.crm.model;

import javax.annotation.Nonnull;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Table("client_details")
public class ClientDetails {
    @Id
    private final Long client;

    @Nonnull
    private final String info;

    public ClientDetails(String info) {
        this(null, info);
    }

    @PersistenceConstructor
    public ClientDetails(Long client, String info) {
        this.client = client;
        this.info = info;
    }

    public Long getClient() {
        return client;
    }

    @Nonnull
    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "ClientInfo{" +
                "client=" + client +
                ", info='" + info + '\'' +
                '}';
    }
}
