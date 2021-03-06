package exercises;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BoxedStreamExercise {
    public static void main(String[] args) {
        //intStream
        List<Integer> ints = IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList());
        System.out.println(ints);
        Optional<Integer> max = IntStream.of(1,2,3,4,5).boxed().max(Integer::compareTo);
        System.out.println(max);

        //longStream
        List<Long> longs = LongStream.of(1l,2l,3l,4l,5l).boxed().collect(Collectors.toList());
        System.out.println(longs);

        //doubleStream
        List<Double> doubles = DoubleStream.of(1d,2d,3d,4d,5d).boxed().collect(Collectors.toList());
        System.out.println(doubles);


    }
}
