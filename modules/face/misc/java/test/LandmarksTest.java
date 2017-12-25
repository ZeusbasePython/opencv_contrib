package org.opencv.test.imgproc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfInt;
import org.opencv.core.MatOfInt4;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfPoint2f;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.core.TermCriteria;
import org.opencv.face.Face;
import org.opencv.test.OpenCVTestCase;

public class LandmarksTest extends OpenCVTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();

    }

    /*public void testAAM() {
        Mat src = getMat(CvType.CV_64F, 2);
        Mat dst = getMat(CvType.CV_64F, 0);
        Mat dst2 = src.clone();

        Imgproc.accumulate(src, dst);
        Imgproc.accumulate(src, dst2);

        assertMatEqual(src, dst, EPS);
        assertMatEqual(getMat(CvType.CV_64F, 4), dst2, EPS);
    }

    public void testAccumulateMatMatMat() {
        Mat src = getMat(CvType.CV_64F, 2);
        Mat mask = makeMask(getMat(CvType.CV_8U, 1));
        Mat dst = getMat(CvType.CV_64F, 0);
        Mat dst2 = src.clone();

        Imgproc.accumulate(src, dst, mask);
        Imgproc.accumulate(src, dst2, mask);

        assertMatEqual(makeMask(getMat(CvType.CV_64F, 2)), dst, EPS);
        assertMatEqual(makeMask(getMat(CvType.CV_64F, 4), 2), dst2, EPS);
    }

    public void testAccumulateProductMatMatMat() {
        Mat src = getMat(CvType.CV_64F, 2);
        Mat dst = getMat(CvType.CV_64F, 0);
        Mat dst2 = src.clone();

        Imgproc.accumulateProduct(src, src, dst);
        Imgproc.accumulateProduct(src, dst, dst2);

        assertMatEqual(getMat(CvType.CV_64F, 4), dst, EPS);
        assertMatEqual(getMat(CvType.CV_64F, 10), dst2, EPS);
    }

    public void testAccumulateProductMatMatMatMat() {
        Mat src = getMat(CvType.CV_64F, 2);
        Mat mask = makeMask(getMat(CvType.CV_8U, 1));
        Mat dst = getMat(CvType.CV_64F, 0);
        Mat dst2 = src.clone();

        Imgproc.accumulateProduct(src, src, dst, mask);
        Imgproc.accumulateProduct(src, dst, dst2, mask);

        assertMatEqual(makeMask(getMat(CvType.CV_64F, 4)), dst, EPS);
        assertMatEqual(makeMask(getMat(CvType.CV_64F, 10), 2), dst2, EPS);
    }

    public void testAccumulateSquareMatMat() {
        Mat src = getMat(CvType.CV_64F, 2);
        Mat dst = getMat(CvType.CV_64F, 0);
        Mat dst2 = src.clone();

        Imgproc.accumulateSquare(src, dst);
        Imgproc.accumulateSquare(src, dst2);

        assertMatEqual(getMat(CvType.CV_64F, 4), dst, EPS);
        assertMatEqual(getMat(CvType.CV_64F, 6), dst2, EPS);
    }

*/
}
