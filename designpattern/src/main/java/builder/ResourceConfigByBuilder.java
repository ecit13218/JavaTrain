package builder;

/**
 * @author : zhengyao3@郑瑶
 * @date : 2020/7/29 17:29
 * @Description: 建造者设计模式
 */
public class ResourceConfigByBuilder {
    private String name;
    private Integer maxTotal;
    private Integer maxIdle;
    private Integer minIdle;

    private ResourceConfigByBuilder() {

    }

    @Override
    public String toString() {
        return "ResourceConfigByBuilder{" +
                "name='" + name + '\'' +
                ", maxTotal=" + maxTotal +
                ", maxIdle=" + maxIdle +
                ", minIdle=" + minIdle +
                '}';
    }

    static class ResourceConfigBuilder {
        private String name;
        private Integer maxTotal;
        private Integer maxIdle;
        private Integer minIdle;

        public ResourceConfigBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ResourceConfigBuilder setMaxTotal(Integer maxTotal) {
            this.maxTotal = maxTotal;
            return this;
        }

        public ResourceConfigBuilder setMaxIdle(Integer maxIdle) {
            this.maxIdle = maxIdle;
            return this;
        }

        public ResourceConfigBuilder setMinIdle(Integer minIdle) {
            this.minIdle = minIdle;
            return this;
        }

        public ResourceConfigByBuilder build() {
            if (name == null || "".equals(name)) {
                throw new RuntimeException("资源名称不能为空");
            }
            if (maxTotal == null || maxTotal < 0) {
                throw new RuntimeException("maxTotal参数错误,maxTotal不能 < 0");
            }
            if (maxIdle == null || maxIdle < 0 || maxIdle > maxTotal) {
                throw new RuntimeException("maxIdle参数错误,maxIdle不能 < 0 或者 > maxTotal");
            }
            if (minIdle == null || minIdle < 0 || minIdle > maxIdle) {
                throw new RuntimeException("minIdle参数错误,minIdle不能 < 0 或者 > maxIdle");
            }
            ResourceConfigByBuilder resourceConfig = new ResourceConfigByBuilder();
            resourceConfig.name = this.name;
            resourceConfig.maxIdle = this.maxIdle;
            resourceConfig.minIdle = this.minIdle;
            resourceConfig.maxTotal = this.maxTotal;
            return resourceConfig;
        }
    }

    public static void main(String[] args) {
        ResourceConfigByBuilder resourceConfig =
                new ResourceConfigByBuilder.ResourceConfigBuilder().
                        setName("test").setMaxTotal(100)
                        .setMaxIdle(55).setMinIdle(50).build();
        System.out.println(resourceConfig);
    }
}