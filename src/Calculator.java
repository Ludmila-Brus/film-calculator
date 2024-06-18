import java.util.List;

public class Calculator {

    private Calculator() {}

    public static double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double runtime = 0.0;
        for (MediaItem mediaItem: mediaItems) {
            if (mediaItem instanceof Series) {
                Series series = (Series) mediaItem;
                runtime += series.getSeriesCount() * mediaItem.getRuntime();
            } else {
                runtime = runtime + mediaItem.getRuntime();
            }
        }
        return runtime / (60*24);
    }

}
