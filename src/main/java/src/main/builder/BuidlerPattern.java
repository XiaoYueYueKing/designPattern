package src.main.builder;

import lombok.Builder;
import lombok.Data;


/**
 * @BelongsProject: DesignModeExam
 * @BelongsPackage: src.main.builder
 * @Author: yueyueking
 * @CreateTime: 2025-06-19  20:50
 * @Description: TODO
 * @Version: 1.0
 */
public class BuidlerPattern {
    public static void main(String[] args) {
        new House.HouseBuilder().door(new Door()).wall(new Wall()).window(new Window());
    }
}

@Data
@Builder
class House{
    private Window window;
    private Door door;
    private Wall wall;
//    public House(Builder builder){
//        this.window = builder.window;
//        this.door = builder.door;
//        this.wall = builder.wall;
//    }

//    static final class Builder{
//        private Window window;
//        private Door door;
//        private Wall wall;

//        public Builder setWindow(Window window) {
//            this.window = window;
//            return this;
//        }
//
//        public Builder setDoor(Door door) {
//            this.door = door;
//            return this;
//        }
//
//        public Builder setWall(Wall wall) {
//            this.wall = wall;
//            return this;
//        }
//    }

}
