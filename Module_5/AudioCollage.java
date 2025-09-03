public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha){
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * alpha;
        }
        return a;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a){
        int index = a.length-1;
        for (int i = 0; i < a.length; i++) { 
            a[i] = a[index-i];
            
        }
        return a;                                                  

    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b){
        double[] new_a = new double[(a.length + b.length)];
        for (int i = 0; i < a.length; i++) { 
            new_a[i] = a[i];
        }

        for (int i = a.length; i < new_a.length; i++) { 
            new_a[i] = b[i-a.length];
        }
        return new_a;

    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b){
        if (a.length > b.length) {
            double[] new_a = new double[a.length];
            for (int i = 0; i < new_a.length; i++) {
                if (i < b.length) {
                    new_a[i] = a[i] + b[i];
                } else {
                    new_a[i] = 0.0;
                }
            }
            return new_a;
        } else {
            double[] new_a = new double[b.length];
            for (int i = 0; i < new_a.length; i++) {
                if (i < a.length) {
                    new_a[i] = a[i] + b[i];
                } else {
                    new_a[i] = 0.0;
                }
            }
            return new_a;
        }
        
        

    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha){
        int n = (int) (a.length / alpha);
        double[] new_sound = new double[n];
        for (int i = 0; i < n; i++) {
            new_sound[i] = a[(int) (i*alpha)];
        }
        return new_sound;


    }

    // Creates an audio collage and plays it on standard audio.
    public static void main(String[] args) {
        double[] sound = StdAudio.read("buzzer.wav");
        double[] sound_2 = StdAudio.read("chimes.wav");
        StdAudio.play(amplify(sound, 2));
        StdAudio.play(reverse(sound_2));
        StdAudio.play(merge(sound, sound_2));
        StdAudio.play(mix(sound, sound_2));
        StdAudio.play(changeSpeed(sound, 2));
        
    }
}