package ru.netology.domain;

public class Like {
    private int countLike;
    private boolean canlike;
    private boolean userLike;
    private boolean canPublish;
    private User user;



    public int getCountLike() {
        return countLike;
    }

    public void setCountLike(int countLike) {
        this.countLike = countLike;
    }

    public boolean isCanlike() {
        return canlike;
    }

    public void setCanlike(boolean canlike) {
        this.canlike = canlike;
    }

    public boolean isUserLike() {
        return userLike;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
