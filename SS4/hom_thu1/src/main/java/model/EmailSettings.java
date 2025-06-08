package model;

public class EmailSettings {
    private String language = "English";
    private int pageSize = 25;
    private boolean spamFilterEnabled = false;
    private String signature = "Thor, King, Asgard";

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamFilterEnabled() {
        return spamFilterEnabled;
    }

    public void setSpamFilterEnabled(boolean spamFilterEnabled) {
        this.spamFilterEnabled = spamFilterEnabled;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}