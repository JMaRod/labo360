package com.axity.dinosaurPark.model.worker;

import com.axity.dinosaurPark.model.ParkState;
import com.axity.dinosaurPark.model.dinosaur.Dinosaur;
import com.axity.dinosaurPark.model.dinosaur.DinosaurStatus;
import java.util.List;

/**
 * Definde a un guardia de dinosaurios
 *
 */
public class KepperWorker extends Worker
{
    ParkState parkState= ParkState.getInstance();

    public KepperWorker(int id, String nombre)
    {
        super(id, nombre, 100.0, WorkerJob.KEPPER);
    }

    /**
     * Recorre la lista, si alguno tiene status ESCAPED entonces ejecuta returnToEnclosure() para recapturarlo
     **/
    public void recaptureEscapedDinosaurs(List<Dinosaur> dinosaurs)
    {
        for(Dinosaur dinosaur: parkState.getAllDinosaur())
        {
            if(dinosaur.getDinosaurStatus().equals(DinosaurStatus.ESCAPED))
            {
                dinosaur.recapture();
            }
        }
    }

}
