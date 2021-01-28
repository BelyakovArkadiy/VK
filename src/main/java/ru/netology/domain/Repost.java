package ru.netology.domain;

public class Repost {
    private int countUserRepost;
    private boolean userRepost;
    private User user;


    public int getCountUserRepost() {
        return countUserRepost;
    }

    public void setCountUserRepost(int countUserRepost) {
        this.countUserRepost = countUserRepost;
    }

    public boolean isUserRepost() {
        return userRepost;
    }

    public void setUserRepost(boolean userRepost) {
        this.userRepost = userRepost;
    }
}
