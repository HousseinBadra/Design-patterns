package Facade;

import java.util.ArrayList;

// The facade design pattern is to provide a blackbox that abstracts the implementation and how sysytem units work together for simplicity
// while in the same time making system components vsisble for who seek customization

public class NeuralNetwork {
    public void train(ArrayList<ArrayList<ArrayList<Integer>>> weights, ArrayList<ArrayList<Integer>> xLabels,
            ArrayList<Integer> yLabels, int epochNum) {
        // epochNum is how many training sessions we want to run
        for (int i = 0; i < epochNum; i++) {
            runTrainingEpoch(weights, xLabels, yLabels);
        }
    }

    public void runTrainingEpoch(ArrayList<ArrayList<ArrayList<Integer>>> weights,
            ArrayList<ArrayList<Integer>> xLabels,
            ArrayList<Integer> yLabels) {
        // we first compute neurons computations
        ArrayList<ArrayList<Integer>> forwardPropagation = forwardPropagate(weights, xLabels);
        // then we compute derevitives for each layer using backward propagation
        ArrayList<ArrayList<ArrayList<Integer>>> backPropagation = backProgagate(forwardPropagation, weights);
        // finally we update weights
        updateParams(weights, backPropagation);
    }

    public ArrayList<ArrayList<Integer>> forwardPropagate(ArrayList<ArrayList<ArrayList<Integer>>> weights,
            ArrayList<ArrayList<Integer>> xLabels) {
        return new ArrayList<>();
    }

    public ArrayList<ArrayList<ArrayList<Integer>>> backProgagate(ArrayList<ArrayList<Integer>> forwardPropagation,
            ArrayList<ArrayList<ArrayList<Integer>>> weights) {
        return new ArrayList<>();
    }

    public void updateParams(ArrayList<ArrayList<ArrayList<Integer>>> weights,
            ArrayList<ArrayList<ArrayList<Integer>>> backPropagation) {
    }
}
