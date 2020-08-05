package builder;

/**
 * @author : zhengyao3@郑瑶
 * @date : 2020/7/29 17:27
 * @Description: 需要构造的实体类
 */
public class ResourceConfig {
    private String name;
    private Integer maxTotal;
    private Integer maxIdle;
    private Integer minIdle;
    
    
    public ResourceConfig(String name ){
        if (name == null || "".equals(name)) {
            throw new RuntimeException("资源名称不能为空");
        }
        this.name = name;
    }

    public void setName(String name) {
        if (name == null || "".equals(name)) {
            throw new RuntimeException("资源名称不能为空");
        }
        this.name = name;
    }

    public void setMaxTotal(Integer maxTotal) {
        if (maxTotal == null || maxTotal < 0) {
            throw new RuntimeException("maxTotal参数错误,maxTotal不能 < 0");
        }
        this.maxTotal = maxTotal;
    }

    public void setMaxIdle(Integer maxIdle) {
        if (maxIdle == null || maxIdle < 0 || maxIdle > maxTotal) {
            throw new RuntimeException("maxIdle参数错误,maxIdle不能 < 0 或者 > maxTotal");
        }
        this.maxIdle = maxIdle;
    }

    public void setMinIdle(Integer minIdle) {
        if (minIdle == null || minIdle < 0 || minIdle > maxIdle) {
            throw new RuntimeException("minIdle参数错误,minIdle不能 < 0 或者 > maxIdle");
        }
        this.minIdle = minIdle;
    }

    @Override
    public String toString() {
        return "ResourceConfig{" +
                "name='" + name + '\'' +
                ", maxTotal=" + maxTotal +
                ", maxIdle=" + maxIdle +
                ", minIdle=" + minIdle +
                '}';
    }

    public static void main(String[] args) {
        ResourceConfig resourceConfig = new ResourceConfig("test");
        resourceConfig.setMaxTotal(150);
        resourceConfig.setMinIdle(100);
        resourceConfig.setMaxIdle(50);
        System.out.println(resourceConfig);
    }
}
