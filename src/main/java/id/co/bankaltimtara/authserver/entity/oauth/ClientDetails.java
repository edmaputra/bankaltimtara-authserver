package id.co.bankaltimtara.authserver.entity.oauth;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "OAUTH_CLIENT_DETAILS")
public class ClientDetails implements Serializable {

    @Id
    @Column(name = "CLIENT_ID")
    private String clientId;

    @Column(name = "RESOURCE_IDS")
    private String resourceId;

    @Column(name = "CLIENT_SECRET")
    private String clientSecret;

    @Column(name = "SCOPE")
    private String scope;

    @Column(name = "AUTHORIZED_GRANT_TYPES")
    private String authorizedGrantTypes;

    @Column(name = "WEB_SERVER_REDIRECT_URI")
    private String webServerRedirectUri;

    @Column(name = "AUTHORITIES")
    private String authorities;

    @Column(name = "ACCESS_TOKEN_VALIDITY")
    private Integer accessTokenValidity;

    @Column(name = "REFRESH_TOKEN_VALIDITY")
    private Integer refreshTokenValidity;

    @Column(name = "ADDITIONAL_INFORMATION")
    private String additionalInformation;

    @Column(name = "AUTOAPPROVE")
    private String autoApprove;

}