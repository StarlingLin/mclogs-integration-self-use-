package gs.mclo.commands;

public enum Permission {
    BASE(0, "mclogs"),
    SHARE_SPECIFIC(0, "mclogs.share"),
    LIST(0, "mclogs.list"),
    ;

    private final int level;
    private final String node;

    Permission(int level, String node) {
        this.level = level;
        this.node = node;
    }

    public int level() {
        return level;
    }

    /**
     * Returns the permission node for this permission.
     *
     * @return permission node
     */
    public String node() {
        return node;
    }
}
