class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1) throw new IllegalArgumentException("Argument must be above 0.");

        int candidate =  2;

        for (int count = 0; count < nth; candidate++)
            if (isPrime(candidate)) count++;

        return candidate - 1;
    }

    boolean isPrime(int candidate) {
        int sqrt = (int) Math.sqrt(candidate);

        for (int i = 2; i <= sqrt; i++)
            if (candidate % i == 0) return false;

        return true;
    }

}
