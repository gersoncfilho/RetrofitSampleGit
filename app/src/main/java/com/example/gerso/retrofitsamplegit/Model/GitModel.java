package com.example.gerso.retrofitsamplegit.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GitModel {

    private String login;
    private long id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions_url;
    private String organizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private String site_admin;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private String hireable;
    private String bio;
    private int public_repos;
    private int public_gists;
    private int followers;
    private int following;
    private String created_at;
    private String updated_at;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSite_admin() {
        return site_admin;
    }

    public void setSite_admin(String site_admin) {
        this.site_admin = site_admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireable() {
        return hireable;
    }

    public void setHireable(String hireable) {
        this.hireable = hireable;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    public int getPublic_gists() {
        return public_gists;
    }

    public void setPublic_gists(int public_gists) {
        this.public_gists = public_gists;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

/*//I created this using http://www.jsonschema2pojo.org/
//Note that not every model can be created using jsonschema2pojo

    @Expose
    private String login;
    @Expose
    private Integer id;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    private String gravatarId;
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("followers_url")
    @Expose
    private String followersUrl;
    @SerializedName("following_url")
    @Expose
    private String followingUrl;
    @SerializedName("gists_url")
    @Expose
    private String gistsUrl;
    @SerializedName("starred_url")
    @Expose
    private String starredUrl;
    @SerializedName("subscriptions_url")
    @Expose
    private String subscriptionsUrl;
    @SerializedName("organizations_url")
    @Expose
    private String organizationsUrl;
    @SerializedName("repos_url")
    @Expose
    private String reposUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("received_events_url")
    @Expose
    private String receivedEventsUrl;
    @Expose
    private String type;
    @SerializedName("site_admin")
    @Expose
    private Boolean siteAdmin;
    @Expose
    private String name;
    @Expose
    private String company;
    @Expose
    private String blog;
    @Expose
    private String location;
    @Expose
    private String email;
    @Expose
    private Boolean hireable;
    @Expose
    private Object bio;
    @SerializedName("public_repos")
    @Expose
    private Integer publicRepos;
    @SerializedName("public_gists")
    @Expose
    private Integer publicGists;
    @Expose
    private Integer followers;
    @Expose
    private Integer following;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    *//**
     *
     * @return
     * The company
     *//*
    public String getCompany() {
        return company;
    }

    *//**
     *
     * @param company
     * The company
     *//*
    public void setCompany(String company) {
        this.company = company;
    }

    *//**
     *
     * @return
     * The blog
     *//*
    public String getBlog() {
        return blog;
    }

    *//**
     *
     * @param blog
     * The blog
     *//*
    public void setBlog(String blog) {
        this.blog = blog;
    }

    *//**
     *
     * @return
     * The location
     *//*
    public String getLocation() {
        return location;
    }

    *//**
     *
     * @param location
     * The location
     *//*
    public void setLocation(String location) {
        this.location = location;
    }

    *//**
     *
     * @return
     * The email
     *//*
    public String getEmail() {
        return email;
    }

    *//**
     *
     * @param email
     * The email
     *//*
    public void setEmail(String email) {
        this.email = email;
    }

    *//**
     *
     * @return
     * The hireable
     *//*
    public Boolean getHireable() {
        return hireable;
    }

    *//**
     *
     * @param hireable
     * The hireable
     *//*
    public void setHireable(Boolean hireable) {
        this.hireable = hireable;
    }

    *//**
     *
     * @return
     * The bio
     *//*
    public Object getBio() {
        return bio;
    }

    *//**
     *
     * @param bio
     * The bio
     *//*
    public void setBio(Object bio) {
        this.bio = bio;
    }

    *//**
     *
     * @return
     * The publicRepos
     *//*
    public Integer getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }


    public Integer getPublicGists() {
        return publicGists;
    }

    *//**
     *
     * @param publicGists
     * The public_gists
     *//*
    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    *//**
     *
     * @return
     * The followers
     *//*
    public Integer getFollowers() {
        return followers;
    }

    *//**
     *
     * @param followers
     * The followers
     *//*
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    *//**
     *
     * @return
     * The following
     *//*
    public Integer getFollowing() {
        return following;
    }

    *//**
     *
     * @param following
     * The following
     *//*
    public void setFollowing(Integer following) {
        this.following = following;
    }

    *//**
     *
     * @return
     * The createdAt
     *//*
    public String getCreatedAt() {
        return createdAt;
    }

    *//**
     *
     * @param createdAt
     * The created_at
     *//*
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    *//**
     *
     * @return
     * The updatedAt
     *//*
    public String getUpdatedAt() {
        return updatedAt;
    }

    *//**
     *
     * @param updatedAt
     * The updated_at
     *//*
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }*/

}