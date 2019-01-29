class Twofer {
    String twofer(String name) {
        String sentencePart2 = "one for me.";
        if (name == null) {
            return "One for you, one for me.";
        } else {
            return String.format("One for %1$s, %2$s", name, sentencePart2);
        }
    }
}
