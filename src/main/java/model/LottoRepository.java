package model;

import java.util.ArrayList;
import java.util.List;

public class LottoRepository {

    private List<Lotto> lottos = new ArrayList<>();;

    private static final LottoRepository instance = new LottoRepository();

    public static LottoRepository getInstance() {
        return instance;
    }

    public void save(List<Lotto> lottos) {
        for(Lotto lotto : lottos) {
            this.lottos.add(lotto);
        }
    }

    public List<Lotto> findAll() {
        return this.lottos;
    }
}
