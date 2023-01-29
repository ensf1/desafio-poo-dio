package br.com.dio.desafio.dominio;

import java.util.*;
import java.util.stream.Collectors;

public class Ranking {

    public Set<Dev> getDevRanking(Set<Dev> devsInscritos) {

        return devsInscritos
                .stream()
                .sorted(Comparator.comparingDouble(Dev::calcularTotalXp).reversed())
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
