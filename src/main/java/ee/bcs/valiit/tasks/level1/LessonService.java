package ee.bcs.valiit.tasks.level1;

import org.springframework.stereotype.Service;

@Service
public class LessonService {


    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    public int min3(int a, int b, int c) {
        int minAB = min(a, b);
        int minBC = min(b, c);
        int minABC = min(minAB, minBC);
        return minABC;
    }

    public int max3(int a, int b, int c) {
        int maxAB = max(a, b);
        int maxBC = max(b, c);
        int maxABC = max(maxAB, maxBC);
        return maxABC;
    }


    public int abs(int a) {
        if (a >= 0) {
            return a;
        } else {
            return -a;
        }
    }


    public boolean isEven(int a) {
        return a % 2 == 0;
    }

}
